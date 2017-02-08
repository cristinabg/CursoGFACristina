package pkg08practica2poo;

import java.util.ArrayList;
import vehiculo.Moto;
import vehiculo.Vehiculo;
import java.util.Scanner;
import vehiculo.Auto;
import vehiculo.Camioneta;
import vehiculo.Moto;

/**
 *
 * @author ac.barrios
 */
public class Main {
    public  ArrayList<Vehiculo> autos = new ArrayList();
    public static void vehiculo(Vehiculo v) {
        v.Registrar();
    }
    public static void verTodo(Vehiculo v) {
        v.consultarTodo();
    }

    public static Vehiculo tipo() {
        Auto auto = new Auto();
        Camioneta camioneta = new Camioneta();
        Moto moto = new Moto();
        int opcion = 0;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tipo de vehiculo: " + "\n" + "1)Auto"
                + "\n" + "2)Camioneta" + "\n" + "3)Moto");
        opcion = lector.nextInt();

        switch (opcion) {
            case 1: return auto;
            case 2: return camioneta;
            case 3: return moto;
            default: break;
        }

        return null;
    }

    public static void buscarTodo() {
        Auto auto = new Auto();
        Camioneta camioneta = new Camioneta();
        Moto moto = new Moto();
        verTodo(auto);
        verTodo(camioneta);
        verTodo(moto);
    }


    public static void main(String[] args) {

        int opcion = 0;
        Boolean bandera=false;
        
        do {
            Scanner lector = new Scanner(System.in);
            System.out.println("Introduce una opción: " + "\n" + "1)Registra Nuevo Vehículo"
                    + "\n" + "2)Consulta Todo" + "\n" + "3)Busca por id"
                    + "\n" + "4)Elimina Vehiculo por id" + "\n" + "5)Salir");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:vehiculo(tipo());
                    break;
                case 2:
                    buscarTodo();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    bandera=true;
                    break;
                default:

            }
        } while (opcion<3);

    }
}
