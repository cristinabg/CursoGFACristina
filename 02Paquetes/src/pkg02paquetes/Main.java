package pkg02paquetes;
import matematicas.Matematicas;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        
        //Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a, b;
        
        System.out.println("Introduce un número");
        a = lector.nextFloat();
        System.out.println("Introduce otro número");
        b = lector.nextFloat();
        
        System.out.println("Resultado Suma = "+ Matematicas.suma(a,b));
        System.out.println("Resultado Resta = "+ Matematicas.resta(a,b));
        System.out.println("Resultado Multiplicacion = "+ Matematicas.multiplicacion(a,b));
        System.out.println("Resultado Division = "+ Matematicas.division(a,b));
        
    }
    
}
