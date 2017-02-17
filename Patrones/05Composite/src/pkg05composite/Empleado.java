/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05composite;

/**
 *
 * @author ac.barrios
 */
public interface Empleado {
    public String getNombre();
    public float getSalario();
    public void agregarEmpleado(Empleado empleado);
    public Empleado getEmpleado(int id);
    public void imprimirSalarioTotal();
}
