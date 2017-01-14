
package persona;

/**
 *
 * @author ac.barrios
 */
public class Persona {
    private String nombre,apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public Persona(String nombreCompleto){
        String[] nombreC = nombreCompleto.split(" ");
        this.nombre = nombreC[0];
        this.apellido = nombreC[1];
        this.edad = 0;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hablar(){
        System.out.println("Hola, mi nombre es: "+ this.nombre);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo: ");
    } 
}
