/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Auto;
import modelos.Vehiculo;
/**
 *
 * @author ac.barrios
 */
public class VehiculoDB {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/vehiculos";
    private static final String user = "root";
    private static final String pass = "12345";

    public List<Auto> getVehiculos() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT b.idAuto, a.marca,"
                + " a.modelo, a.costo, b.kilometros, b.vuela FROM vehiculo a "
                + "INNER JOIN auto b WHERE b.idAuto = a.idVehiculo");

        ArrayList<Auto> lista = new ArrayList<>();

        while (resultado.next()) {
            Auto auto = new Auto();
            auto.setIdVehiculo(resultado.getString("idAuto"));
            auto.setMarca(resultado.getString("marca"));
            auto.setModelo(resultado.getString("modelo"));
            auto.setCosto(resultado.getDouble("costo"));
            auto.setKilometros(resultado.getDouble("kilometros"));
            auto.setVuela(resultado.getBoolean("vuela"));
            lista.add(auto);
        }
        resultado.close();
        consulta.close();
        conexion.close();

        return lista;
    }

        public Boolean insertarVehiculo(Auto auto) throws ClassNotFoundException, SQLException {

        Class.forName(jdbcDriver);

        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String insertaAuto = String.format("INSERT INTO auto(idAuto,kilometros,vuela) VALUES ('%s','%f','%b')",
                auto.getIdAuto(), auto.getKilometros(), auto.isVuela());
        String insertaVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                auto.getIdAuto(), auto.getMarca(), auto.getModelo(), auto.getCosto());
        int respAuto = consulta.executeUpdate(insertaAuto);
        int respVehiculo = consulta.executeUpdate(insertaVehiculo);
        consulta.close();
        conexion.close();
        
        if (respAuto == 1 && respVehiculo ==1) {
            return true;
        }

        return false;
    }
}
