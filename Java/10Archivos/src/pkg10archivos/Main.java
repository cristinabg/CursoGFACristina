/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.util.Scanner;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       Scanner lector2 = new Scanner(System.in);
       
//       System.out.println("Ingresa el Código del error");
//       int codigo = lector.nextInt();
//       System.out.println("Ingresa la Descripción del error");
//       String descripcion = lector2.nextLine();
//       
//       Error error = new Error(codigo, descripcion);
//       error.escribir("C:\\Users\\ac.barrios\\Documents\\NetBeansProjects\\10Archivos\\src\\pkg10archivos\\Error.txt");
//       
       
      IEscribible e = new Error();
      e.leer("C:\\Users\\ac.barrios\\Documents\\NetBeansProjects\\10Archivos\\src\\pkg10archivos\\Error.txt", 1484411527261L);
      System.out.println(e);
    
    }
    
}
