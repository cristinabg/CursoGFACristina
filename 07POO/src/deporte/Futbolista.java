/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deporte;
import java.util.logging.Logger;
import persona.Persona;
/**
 *
 * @author ac.barrios
 */
public class Futbolista extends Persona implements Deporte{
    
    private String posicion;
    private int dorsal;
    
    public Futbolista(String nombre, String apellido, int edad, String posicion, int dorsal){
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Juega un partido");
    }
    
    @Override
    public void jugar(){
        System.out.println("Cardio");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja al estadio");
    }
    
    @Override
    public void hablar(){
        System.out.println("Se hizo lo que se pudo..., dimos lo mejor");
    }
    
     @Override
    public void comer(){
        System.out.println("Quiero Pizza");
    }
    
     @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() +
                " Edad: " + getEdad() + " Posicion: " + posicion +
                " Dorsal: " + dorsal;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }
    
    
}
