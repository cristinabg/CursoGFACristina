/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11expresioneslambda;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IMatematicas suma = (float a, float b) -> a + b;
        IMatematicas resta = (float a, float b) -> a - b;
        IMatematicas multi = (float a, float b) -> a * b;
        IMatematicas division = (float a, float b) -> a / b;
        
        System.out.println("Suma de 10 + 20 = "+operar(10f, 20f, suma));
        System.out.println("Resta de 10 -20 = "+operar(10f, 20f, resta));
        System.out.println("Multiplicacion de 10 * 20 = "+operar(10f, 20f, multi));
        System.out.println("División de 10 / 20 = "+operar(10f, 20f, division));
    }
    
    static float operar(float a, float b, IMatematicas operacion){
        return operacion.operacion(a,b);
    }
}
