package modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ac.barrios
 */
public class Camioneta extends Vehiculo {

    private String idCamioneta;
    public int numPuertas;
    public String color;
    private static int id;
    private static ArrayList<Camioneta> camioneta = new ArrayList();

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getIdCamioneta() {
        return idCamioneta;
    }

    public String getColor() {
        return color;
    }

    public void setIdCamioneta() {
        this.idCamioneta = "c00"+id;
    }
    
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Camioneta(String idVehiculo, String marca, String modelo, Double costo, int numPuertas, String color) {
        super(idVehiculo, marca, modelo, costo);
        this.idCamioneta = idVehiculo;
        this.numPuertas = numPuertas;
        this.color = color;
    }

    public Camioneta() {
    }

    @Override
    public void Registrar() {
        Scanner lectorString = new Scanner(System.in);
        Scanner lectorDouble = new Scanner(System.in);
        Scanner lectorInt = new Scanner(System.in);
        Camioneta c = new Camioneta();
        System.out.println("Ingresa marca: ");
        c.setMarca(lectorString.nextLine());
        System.out.println("Ingresa modelo: ");
        c.setModelo(lectorString.nextLine());
        System.out.println("Ingresa costo:");
        c.setCosto(lectorDouble.nextDouble());
        System.out.println("Ingresa num puertas");
        c.setNumPuertas(lectorInt.nextInt());
        System.out.println("Ingresa color: ");
        c.setColor(lectorString.nextLine());

        camioneta.add(new Camioneta(c.getIdCamioneta(),c.getMarca(),c.getModelo(),c.getCosto(),c.getNumPuertas(),c.getColor()));
    }

    @Override
    public void consultarTodo() {
        System.out.println("==============CAMIONETAS===============");
        for(int valor = 0; valor < camioneta.size(); valor++) {
            System.out.println(
                    "Marca: " + camioneta.get(valor).getMarca() + " "
                    + "Modelo: " + camioneta.get(valor).getModelo() + " "
                    + "Costo: " + camioneta.get(valor).getCosto() + " "
                    + "Num. Puertas: " + camioneta.get(valor).numPuertas + " "
                    + "Color: " + camioneta.get(valor).color);
        }
        System.out.println("=======================================");
    }
}
