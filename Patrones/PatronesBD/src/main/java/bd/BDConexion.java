/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ac.barrios
 */
public class BDConexion {

    private static final String jdbcDriver = "com.mysql.jdbc.Driver";
    // private static final String dbUrl = "jdbc:mysql://localhost:3306/corridas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "admin";
    private Connection conexion;
    private Statement statement;

    public boolean abrirConexion(String url) {
        
        try {
            try {
                Class.forName(jdbcDriver);
            } catch (ClassNotFoundException ex) {
               return false;
            }
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            return false;
        }
        try {
            statement = conexion.createStatement();
        } catch (SQLException ex) {
           return false;
        }
        return true;
    }
    
     public void cerrarConexion() throws SQLException{
        if(statement!=null){
        conexion.close();
        statement.close();
        }
    
    }

    public Connection getConexion() {
        return conexion;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

}
