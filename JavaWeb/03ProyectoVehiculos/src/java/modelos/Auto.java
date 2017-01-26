
package modelos;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ac.barrios
 */
public class Auto extends Vehiculo {
    
    private String idAuto;
    private Double kilometros;
    private Boolean vuela;
    private static int id;
    
    private static ArrayList<Auto> autos = new ArrayList();
    public Double getKilometros() {
        return kilometros;
    }

    public void setIdAuto(String idAuto) {
        this.idAuto = "a00"+idAuto;
    }

    public void setKilometros(Double kilometros) {
        this.kilometros = kilometros;
    }

    public void setVuela(Boolean vuela) {
        this.vuela = vuela;
    }

    public String getIdAuto() {
        return idAuto;
    }

    public Boolean isVuela() {
        return vuela;
    }
    
    public Auto(String idVehiculo, String marca, String modelo, double costo, double kilometros, boolean vuela) {
        super(idVehiculo,marca, modelo, costo);
        this.idAuto = idVehiculo;
        this.kilometros = kilometros;
        this.vuela = vuela;
    }
    public Auto(){
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
