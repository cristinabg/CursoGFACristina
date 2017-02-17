/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03strategy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        List<Matematicas> lista = Arrays.asList(
                new Suma(), 
                new Resta(),
                new Multiplicacion(),
                new Division()
        );
        
        lista.forEach(estrategia->{
            System.out.println(estrategia.operacion(5, 3));
        });
        
        //Aplicando funciones lambda
        List<Matematicas> listaLambda = Arrays.asList(
                (a,b)->a+b,
                (a,b)->a-b,
                (a,b)->a*b,
                (a,b)->a/b,
                (a,b)->(float)Math.pow(a,b)
        );
        
         listaLambda.forEach(estrategia->{
            System.out.println(estrategia.operacion(5, 3));
        });
    }
    
}
