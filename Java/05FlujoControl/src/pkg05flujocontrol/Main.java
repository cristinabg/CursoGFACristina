
package pkg05flujocontrol;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        String[] nombres = new String[5];
        Scanner lector = new Scanner(System.in);
      
        for(int valor = 0; valor<nombres.length; valor++){
            System.out.println("Introduce nombre: ");
            nombres[valor] = lector.nextLine();
        }
        
        for(int imprimir = 0; imprimir<nombres.length; imprimir++){
            System.out.println("Nombre "+(imprimir+1)+": "+nombres[imprimir]);
        }
       
    }
    
}
