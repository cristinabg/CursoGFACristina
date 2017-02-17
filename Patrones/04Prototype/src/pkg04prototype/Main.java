/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04prototype;

public class Main {

    public static void main(String[] args) {
        Cache.llenarMap();
        Figura figura1 = Cache.obtenerFigura(1);
        Figura figura2 = Cache.obtenerFigura(2);
        Figura figura3 = Cache.obtenerFigura(3);
        
        System.out.println(figura1.getTipo());
        System.out.println(figura2.getTipo());
        System.out.println(figura3.getTipo());
    }
    
}
