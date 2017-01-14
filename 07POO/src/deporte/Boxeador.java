
package deporte;
import persona.Persona;
/**
 *
 * @author ac.barrios
 */
public class Boxeador extends Persona implements Deporte{

    String peso;
    
    public Boxeador(String nombre, String apellido, int edad, String peso) {
        super(nombre, apellido, edad);
        this.peso = peso;
    }
    
    @Override 
    public void entrenar(){
        System.out.println("Asistir al gym a las 5:00 a.m.");
    };
    
    @Override
    public void jugar(){
        System.out.println("Deportiva 1");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viajar a ricón del Sur");
    }
}
