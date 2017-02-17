/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04prototype;

import java.util.HashMap;

/**
 *
 * @author ac.barrios
 */
public class Cache {
    static HashMap<Integer,Figura> mapa = new HashMap<>();
    
    public static Figura obtenerFigura(int id){
     Figura figuraOriginal = mapa.get(id);
     return (Figura) figuraOriginal.clone();
    }
    
    public static void llenarMap(){
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();
        Rombo rombo = new Rombo();
        circulo.setId(1);
        rectangulo.setId(2);
        cuadrado.setId(3);
        rombo.setId(4);
        
        mapa.put(circulo.getId(), circulo);
        mapa.put(rectangulo.getId(), rectangulo);
        mapa.put(cuadrado.getId(),cuadrado);
        mapa.put(rombo.getId(),rombo);
    }
}
