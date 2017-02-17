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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Gerente("Juan", 300000f, 1);
        Empleado e2 = new Gerente("Jose", 300000f, 2);
        Empleado e3 = new Gerente("Karina", 300000f, 3);
        e1.agregarEmpleado(e2);
        e1.agregarEmpleado(e3);

        Empleado c1 = new Colabrador("Luis", 300000f, 4);
        Empleado c2 = new Colabrador("Roberto", 300000f, 5);

        e2.agregarEmpleado(c1);
        e2.agregarEmpleado(c2);

        Empleado c3 = new Colabrador("Rocio", 300000f, 6);
        Empleado c4 = new Colabrador("Rodolfo", 300000f, 7);

        e3.agregarEmpleado(c3);
        e3.agregarEmpleado(c4);
        
        e1.imprimirSalarioTotal();
    }

}
