package vehiculo;

/**
 *
 * @author ac.barrios
 */
public abstract class Vehiculo {

    private int idVehiculo;
    private String marca;
    private String modelo;
    private Double costo;
    
    private Vehiculo [] vehiculos;
    
    public Vehiculo(String marca, String modelo, Double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }
    public Vehiculo(){
        
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
    
    public abstract void Registrar(Vehiculo vehiculo);

    public abstract Vehiculo consultarTodo();
}
