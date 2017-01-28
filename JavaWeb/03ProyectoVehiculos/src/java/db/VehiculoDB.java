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
<<<<<<< HEAD
import modelos.Camioneta;
import modelos.Moto;
import modelos.Vehiculo;

=======
import modelos.Vehiculo;
>>>>>>> 2a04e41aa22ea73394c77d467cf7686d63d4e073
/**
 *
 * @author ac.barrios
 */
public class VehiculoDB {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/vehiculos";
    private static final String user = "root";
<<<<<<< HEAD
    private static final String pass = "admin";

    public List<Object> getVehiculos(String tipo) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        List<Object> lista = null;
        Auto auto = new Auto();
        Camioneta camioneta = new Camioneta();

        if (tipo == "auto") {
            ResultSet resultado = consulta.executeQuery("SELECT b.idAuto, a.marca,"
                    + " a.modelo, a.costo, b.kilometros, b.vuela FROM vehiculo a "
                    + "INNER JOIN auto b WHERE b.idAuto = a.idVehiculo");

            while (resultado.next()) {
                auto = new Auto();
                auto.setIdVehiculo(resultado.getString("idAuto"));
                auto.setMarca(resultado.getString("marca"));
                auto.setModelo(resultado.getString("modelo"));
                auto.setCosto(resultado.getDouble("costo"));
                auto.setKilometros(resultado.getDouble("kilometros"));
                auto.setVuela(resultado.getBoolean("vuela"));
                lista.add(auto);
            }
            resultado.close();
        } else if (tipo == "camioneta") {
            ResultSet resultado = consulta.executeQuery("SELECT b.idAuto, a.marca,"
                    + " a.modelo, a.costo, b.kilometros, b.vuela FROM vehiculo a "
                    + "INNER JOIN auto b WHERE b.idAuto = a.idVehiculo");

            while (resultado.next()) {
                auto = new Auto();
                auto.setIdVehiculo(resultado.getString("idAuto"));
                auto.setMarca(resultado.getString("marca"));
                auto.setModelo(resultado.getString("modelo"));
                auto.setCosto(resultado.getDouble("costo"));
                auto.setKilometros(resultado.getDouble("kilometros"));
                auto.setVuela(resultado.getBoolean("vuela"));
                lista.add(auto);
            }
            resultado.close();
        }

=======
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
>>>>>>> 2a04e41aa22ea73394c77d467cf7686d63d4e073
        consulta.close();
        conexion.close();

        return lista;
    }

<<<<<<< HEAD
    public Boolean insertarVehiculo(Object tipo) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String insertarTipo = "";
        String insertarVehiculo = "";
        Auto auto = (Auto)tipo;
        if (tipo == auto) {
            insertarTipo = String.format("INSERT INTO auto(idAuto,kilometros,vuela) VALUES ('%s','%f',%b)",
                    auto.getIdAuto(), auto.getKilometros(), auto.isVuela());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    auto.getIdAuto(), auto.getMarca(), auto.getModelo(), auto.getCosto());
        } else if (tipo == "camioneta") {
            Camioneta camioneta = new Camioneta();
            insertarTipo = String.format("INSERT INTO auto(idCamioneta,numPuertas,color) VALUES ('%s','%d','%s')",
                    camioneta.getIdCamioneta(), camioneta.getNumPuertas(), camioneta.getColor());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    camioneta.getIdCamioneta(), camioneta.getMarca(), camioneta.getModelo(), camioneta.getCosto());
        } else if (tipo == "moto") {
            Moto moto = new Moto();
            insertarTipo = String.format("INSERT INTO auto(idMoto,anio,tipo) VALUES ('%s','%d','%s')",
                    moto.getIdMoto(), moto.getAnio(), moto.getTipo());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    moto.getIdMoto(), moto.getMarca(), moto.getModelo(), moto.getCosto());
        }

        int respTipo = consulta.executeUpdate(insertarTipo);
        int respVehiculo = consulta.executeUpdate(insertarVehiculo);
        consulta.close();
        conexion.close();

        if (respTipo == 1 && respVehiculo == 1) {
            return true;
        }

        return false;
    }

    public Boolean updateVehiculo(String tipo) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        String insertarTipo = "";
        String insertarVehiculo = "";

        if (tipo == "auto") {
            Auto auto = new Auto();
            insertarTipo = String.format("INSERT INTO auto(idAuto,kilometros,vuela) VALUES ('%s','%f','%b')",
                    auto.getIdAuto(), auto.getKilometros(), auto.isVuela());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    auto.getIdAuto(), auto.getMarca(), auto.getModelo(), auto.getCosto());
        } else if (tipo == "camioneta") {
            Camioneta camioneta = new Camioneta();
            insertarTipo = String.format("INSERT INTO auto(idCamioneta,numPuertas,color) VALUES ('%s','%d','%s')",
                    camioneta.getIdCamioneta(), camioneta.getNumPuertas(), camioneta.getColor());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    camioneta.getIdCamioneta(), camioneta.getMarca(), camioneta.getModelo(), camioneta.getCosto());
        } else if (tipo == "moto") {
            Moto moto = new Moto();
            insertarTipo = String.format("INSERT INTO auto(idMoto,anio,tipo) VALUES ('%s','%d','%s')",
                    moto.getIdMoto(), moto.getAnio(), moto.getTipo());
            insertarVehiculo = String.format("INSERT INTO vehiculo(idVehiculo,marca,modelo,costo)VALUES('%s','%s','%s','%f')",
                    moto.getIdMoto(), moto.getMarca(), moto.getModelo(), moto.getCosto());
        }

        int respTipo = consulta.executeUpdate(insertarTipo);
        int respVehiculo = consulta.executeUpdate(insertarVehiculo);
        consulta.close();
        conexion.close();

        if (respTipo == 1 && respVehiculo == 1) {
=======
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
>>>>>>> 2a04e41aa22ea73394c77d467cf7686d63d4e073
            return true;
        }

        return false;
    }
}
