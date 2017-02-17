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
public class Colabrador implements Empleado {

    private String nombre;
    private float salario;
    private int id;

     public Colabrador(String nombre, float salario, int id){
        this.nombre = nombre;
        this.salario  = salario;
        this.id = id;
    }
     
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public float getSalario() {
        return this.salario;
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {

    }

    @Override
    public Empleado getEmpleado(int id) {
        return null;
    }

    @Override
    public void imprimirSalarioTotal() {
          System.out.println(nombre + " : "+ salario);
    }

}
