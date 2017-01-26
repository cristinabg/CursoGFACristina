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

    public void setIdCamioneta(String idCamioneta) {
        this.idCamioneta = "c00"+idCamioneta;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
