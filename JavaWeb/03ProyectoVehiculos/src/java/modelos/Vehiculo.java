package modelos;

import java.util.ArrayList;

/**
 *
 * @author ac.barrios
 */
public abstract class Vehiculo {

    private String idVehiculo;
    private String marca;
    private String modelo;
    private Double costo;
    
    public Vehiculo(String idVehiculo, String marca, String modelo, Double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }
    public Vehiculo(){
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCosto() {
        return costo;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }
    
    public abstract void Registrar();

    public abstract void consultarTodo();
}
