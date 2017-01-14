package pkg08practica2poo;

import vehiculo.Moto;
import vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una opción: " + "\n" + "1)Reegistra Nuevo Vehículo"
                + "\n" + "2)Elimina Vehiculo por id" + "\n" + "3)Busca por id" 
                + "\n" + "4)Consulta todo"+ "\n" + "5)Salir");
        opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:

        }

    }
}