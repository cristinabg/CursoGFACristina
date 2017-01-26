package modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ac.barrios
 */
public class Moto extends Vehiculo {

    private String idMoto;
    public int anio;
    public String tipo;
    private static int id;
    private static ArrayList<Moto> moto = new ArrayList();

    public String getIdMoto() {
        return idMoto;
    }
    
    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setIdMoto(String idMoto) {
        this.idMoto = "m001"+idMoto;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Moto(String idVehiculo, String marca, String modelo, Double costo, int anio, String tipo) {
        super(idVehiculo,marca, modelo, costo);
        this.anio = anio;
        this.tipo = tipo;
    }
    
    public Moto(){}

    @Override
    public void Registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
