
package pkg06flujocontroldos;
import operaciones.Operaciones;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        int tamanioArreglo = 0;
        int opcion = 0;
        int[] numeros;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce Tamaño del arreglo: ");
        tamanioArreglo = lector.nextInt();
        numeros = new int[tamanioArreglo];
        
        for(int valor = 0; valor<numeros.length; valor++){
            System.out.println("Introduce Número: ");
            numeros[valor] = lector.nextInt();
        }
        
        System.out.println("Introduce una opción: "+"\n"+"1)Suma del arreglo"+"\n"+"2)Calcular la media"+"\n"+"3)Número mayor del arreglo");
        opcion = lector.nextInt();
        
        switch(opcion){
            case 1: System.out.println("Resultado Suma: "+ Operaciones.suma(numeros));
            break;
            case 2: System.out.println("Resultado Media: "+ Operaciones.media(numeros));
            break;
            case 3: System.out.println("Resultado Mayor: "+ Operaciones.mayor(numeros));
            break;
            default: System.out.println("Introduce una opción: "+"\n"+"1)Suma del arreglo"+"\n"+"2)Calcular la media"+"\n"+"3)Número mayor del arreglo");
        opcion = lector.nextInt();
            
        }
    }
    
}
