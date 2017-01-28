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
import modelos.Autobus;

/**
 *
 * @author ac.barrios
 */
public class AutobusDB {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/gfajava";
    private static final String user = "root";
    private static final String pass = "12345";

    public List<Autobus> getAutobuses() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT*FROM autobus");

        ArrayList<Autobus> lista = new ArrayList<>();

        while (resultado.next()) {
            Autobus autobus = new Autobus();

            autobus.setNum_autobus(resultado.getInt("num_autobus"));
            autobus.setSiglas(resultado.getString("siglas"));
            autobus.setModelo(resultado.getInt("modelo"));
            autobus.setCapacidad(resultado.getInt("capacidad"));
            autobus.setBase(resultado.getString("base"));
            lista.add(autobus);
        }
        resultado.close();
        consulta.close();
        conexion.close();

        return lista;
    }

    public Boolean insertarAutobus(Autobus autobus) throws ClassNotFoundException, SQLException {

        Class.forName(jdbcDriver);

        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String query = String.format("INSERT INTO autobus(num_autobus,siglas,modelo,capacidad,base) VALUES ('%d','%s','%d','%d','%s')",
                autobus.getNum_autobus(), autobus.getSiglas(), autobus.getModelo(), autobus.getCapacidad(), autobus.getBase());

        int respuesta = consulta.executeUpdate(query);
        consulta.close();
        conexion.close();
        
        if (respuesta == 1) {
            return true;
        }

        return false;
    }
}
