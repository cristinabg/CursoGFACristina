/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07poo;
import persona.Persona;
import deporte.Futbolista;
import deporte.Boxeador;
import deporte.Deporte;
import oficina.Desarrollador;
import oficina.Operador;
/**
 *
 * @author ac.barrios
 */
public class Main {
    public static void pruebaInterfaz(Deporte d){
        d.entrenar();
    }
    
    public static void pruebaHerencia(Persona p){
        p.hablar();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Ana Barrios");
        p.setEdad(20);
        
        Persona p2 = new Persona("José", "Peréz", 23);
        
        System.out.println("Nombre: "+ p.getNombre() +" Apellido: "+
                            p.getApellido() + " Edad:" + p.getEdad());
        System.out.println("Nombre: "+ p2.getNombre() +" Apellido: "+
                            p2.getApellido() + " Edad:" + p2.getEdad());
        
        Futbolista f = new Futbolista("Cristina", "Barrios", 18, "Delantero", 2);
        f.hablar();
        System.out.println(p);
        System.out.println(f);
        
        Desarrollador d = new Desarrollador("Cristina", "Barrios", 18, 999388, 2.0f);
        Operador o = new Operador("Juan", "Peréz", 18, 999388, 2.0f);
        
        Futbolista futbolista1 = new Futbolista("Cristina", "Barrios", 18, "Delantero", 2);
        Boxeador boxeador = new Boxeador("Cristina", "Barrios", 18, "Pluma");
        pruebaInterfaz(futbolista1);
        pruebaHerencia(futbolista1);
        pruebaInterfaz(boxeador);
        pruebaHerencia(boxeador);
    }
    
}
