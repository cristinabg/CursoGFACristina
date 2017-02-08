/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador;

/**
 *
 * @author ac.barrios
 */
public class Operador {
    
    private String nombre;
    private int clave;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Operador() {
    }

    public Operador(String nombre, int clave, boolean activo) {
        this.nombre = nombre;
        this.clave = clave;
        this.activo = activo;
    }
    
    
}
