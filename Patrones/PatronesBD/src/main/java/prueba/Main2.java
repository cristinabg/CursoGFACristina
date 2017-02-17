/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import bd.BDCorrida;
import coleccion.CorridaIterator;
import coleccion.ListadoCorridas;
import java.sql.SQLException;
import modelo.Corrida;

/**
 *
 * @author ac.barrios
 */
public class Main2 {

    public static void main(String[] args) throws SQLException {
        BDCorrida bdConexion = BDCorrida.getInstance();
        try {
            ListadoCorridas listadoCorridas = bdConexion.obtenerCorridas();
            System.out.println(listadoCorridas.getNombre());
            
           /* for(CorridaIterator iterator = listadoCorridas.iterator();iterator.hasNext();){
                Corrida corrida = iterator.next();
                System.out.println(corrida);
            }*/
           
           listadoCorridas.iterator().forEachRemaining((corrida)->{
               System.out.println(corrida);
           });
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }
}
