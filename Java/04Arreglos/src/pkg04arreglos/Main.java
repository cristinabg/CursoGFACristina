
package pkg04arreglos;
public class Main {

    public static void main(String[] args) {
        
        int[] enteros = new int[10]; 
        enteros[0] = 10;
        int[] enterosInicializados = {1,2,3,4,5,6,7,8,9};
        String[] cadenas = new String[10];
        boolean[] bol = new boolean[10];
        
        System.out.println(enteros[0]);
        System.out.println(enterosInicializados[0]);
        System.out.println(cadenas[0]);
        System.out.println(bol[0]);
        
        //Arreglos bidimensionales
        int[][] enteroBidimensional = new int[2][3];
        int[][] enteroBiInicializado = {{1,3,4},{3,5,2}};
        
        System.out.println(enteroBiInicializado[1][0]);
        
    }
    
}
