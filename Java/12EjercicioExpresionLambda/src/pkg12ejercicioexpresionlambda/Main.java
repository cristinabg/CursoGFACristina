/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12ejercicioexpresionlambda;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] pares = new int[5];
        
        IParImpar par = (int[] num) -> {
            int contador = 0;
            for (int valor = 0; valor < num.length; valor++) {
                int resultado = num[valor] % 2;
                if (resultado == 0) {
                    pares[contador] = num[valor];
                    contador++;
                }
            }
            return num;
        };
         IParImpar impar = (int[] num) -> {
            int contador = 0;
            for (int valor = 0; valor < num.length; valor++) {
                int resultado = num[valor] % 2;
                if (resultado != 0) {
                    pares[contador] = num[valor];
                    contador++;
                }
            }
            return num;
        };
         
        revisar(numero, par);
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
        
    }

    static int[] revisar(int[] num, IParImpar tipo) {
        return tipo.numeros(num);
    }

}
