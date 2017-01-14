
package agencia;

import vehiculo.Vehiculo;

/**
 *
 * @author ac.barrios
 */
public class Auto extends Vehiculo {

    public Double kilometros;
    public boolean vuela;

    public Double getKilometros() {
        return kilometros;
    }

    public void setKilometros(Double kilometros) {
        this.kilometros = kilometros;
    }

    public Auto(String marca, String modelo, Double costo, Double kilometros, boolean vuela) {
        super(marca, modelo, costo);
        this.kilometros = kilometros;
        this.vuela = vuela;
    }
}
