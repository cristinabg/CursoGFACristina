package vehiculo;

import vehiculo.Vehiculo;

/**
 *
 * @author ac.barrios
 */
public class Moto extends Vehiculo {

    public int anio;
    public String tipo;

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Moto(String marca, String modelo, Double costo, int anio, String tipo) {
        super(marca, modelo, costo);
        this.anio = anio;
        this.tipo = tipo;
    }
    
}
