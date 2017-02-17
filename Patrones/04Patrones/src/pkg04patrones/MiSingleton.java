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
public class MiSingleton {
    
    private String nombre; 
    static private MiSingleton miSingleton;
    
    public static MiSingleton getInstance(String nombre){
        if(miSingleton==null){
            miSingleton = new MiSingleton(nombre);
        }
        return miSingleton;
    }
    
    public int suma(int a, int b){
        return a+b;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private MiSingleton(String nombre) {
        this.nombre = nombre;
    }
    
}