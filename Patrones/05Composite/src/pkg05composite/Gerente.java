/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ac.barrios
 */
public class Gerente implements Empleado {

    private String nombre;
    private float salario;
    private int id;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Gerente(String nombre, float salario, int id){
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
        this.empleados.add(empleado);
    }

    @Override
    public Empleado getEmpleado(int id) {
        return empleados.get(id);
    }

    @Override
    public void imprimirSalarioTotal() {
        System.out.println(nombre + " : "+ salario);
        Iterator<Empleado> iterator = empleados.iterator();
        
        while(iterator.hasNext()){
            Empleado em = iterator.next();
            em.imprimirSalarioTotal();
        }
        
    }

}
