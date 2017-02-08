
package oficina;
import persona.Persona;
/**
 *
 * @author ac.barrios
 */
public abstract class Empleado extends Persona{
    private int claveEmpleado;
    private float salario;
    
    public Empleado(String nombre, String apellido, int edad, int claveEmpleado, float salario){
        super(nombre, apellido, edad);
        this.claveEmpleado = claveEmpleado;
        this.salario = salario;
        trabajar();
    }
    
    public abstract void trabajar();
    
    public abstract void transporteTorta();
}
