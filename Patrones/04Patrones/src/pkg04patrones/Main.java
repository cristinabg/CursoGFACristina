/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04patrones;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MiSingleton instancia1 = MiSingleton.getInstance("Instncia1");
       System.out.println("Nombre de la instancia: " +instancia1.getNombre());
       MiSingleton instancia2 = MiSingleton.getInstance("Instncia2");
       System.out.println("Nombre de la instancia: " +instancia2.getNombre());
       
       
    }
    
}
