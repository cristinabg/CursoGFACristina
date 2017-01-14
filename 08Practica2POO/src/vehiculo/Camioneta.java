package vehiculo;

import vehiculo.Vehiculo;

/**
 *
 * @author ac.barrios
 */
public class Camioneta extends Vehiculo {

    public int numPuertas;
    public String color;

    public Camioneta(String marca, String modelo, Double costo, int numPuertas, String color) {
        super(marca, modelo, costo);
        this.numPuertas = numPuertas;
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
