/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author ac.barrios
 */
public class Operador extends Empleado {

    public Operador(String nombre, String apellido, int edad, int claveEmpleado, float salario) {
        super(nombre, apellido, edad, claveEmpleado, salario);
    }

   
    @Override
    public void trabajar(){
        System.out.println("Conduce unidades");
    }
    
    @Override
    public void transporteTorta(){
         System.out.println("Trafica tortas con sobres azules");
    }
    
}
