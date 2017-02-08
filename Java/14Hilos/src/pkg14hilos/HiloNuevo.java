/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ac.barrios
 */
public class HiloNuevo implements Runnable{

    int id;
    
    public HiloNuevo (int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Inicio de hilo 3 Seg.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fin de hilo 3 seg. Id: "+ id);
    }
    
}
