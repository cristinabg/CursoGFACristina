/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Estado;

/**
 *
 * @author ac.barrios
 */
public class estadoBD {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/estadosmexico";
    private static final String user = "root";
    private static final String pass = "admin";

    public static String getCapital(String estadoNombre) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT capital FROM estados WHERE nombre = '" + estadoNombre+"'");

        String estado = null;
        
        if (resultado.next()) {
            estado = (resultado.getString("capital"));
        }
        resultado.close();
        consulta.close();
        conexion.close();
        
        return estado;
    }
    
    public static int getPoblacion(String estadoNombre) throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT poblacion FROM estados WHERE nombre = '" + estadoNombre+"'");

        int poblacion = 0;
        
        
        if (resultado.next()) {
            poblacion = (resultado.getInt("poblacion"));
        }
        resultado.close();
        consulta.close();
        conexion.close();
        return poblacion;
    }
    
    public static Estado[] getEstados() throws ClassNotFoundException, SQLException{
        Class.forName(jdbcDriver);
        Connection conexion = DriverManager.getConnection(dbUrl, user, pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM estados");
        ArrayList<Estado> lista = new ArrayList<Estado>();
        
        while (resultado.next()) {
            lista.add(new Estado(
                resultado.getInt("idEstado"),
                resultado.getString("nombre"),
                resultado.getInt("municipios"),
                resultado.getString("capital"),
                resultado.getString("comidaTipica"),
                resultado.getInt("poblacion")
              ));
        }
        resultado.close();
        consulta.close();
        conexion.close();
        Estado[] es = new Estado[lista.size()];
        
        return  lista.toArray(es);
    }
}
