/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import bd.BDCorrida;
import java.sql.SQLException;
import modelo.Corrida;

/**
 *
 * @author ac.barrios
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        BDCorrida bdConexion = BDCorrida.getInstance();
        try{
            Corrida corrida = bdConexion.BuscarCorrida(4);
            System.out.println(corrida);
        }catch(ClassNotFoundException ex){
            
        }catch(SQLException ex){
            
        }
    }
}
