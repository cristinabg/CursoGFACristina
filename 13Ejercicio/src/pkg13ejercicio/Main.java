/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13ejercicio;

import java.util.ArrayList;
import operador.Operador;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ac.barrios
 */
public class Main {

    static List<Operador> lista = Arrays.asList(
            new Operador("Eduardo",999731,true),   
            new Operador("Samuel",999286,true),                
            new Operador("Jose",22395,true));
    
    public static void main(String[] args) {
        long tiempoInicio = System.currentTimeMillis();
        filtroNuevo();
        long tiempoFin = System.currentTimeMillis();
        System.out.println(tiempoFin-tiempoInicio);
        filtroAntiguo();
    }
    
    public static void filtroNuevo(){
        List<Operador> operadores = lista.stream()
                .filter(op->op.isActivo())
                .collect(Collectors.toList());
        imprimir(operadores);
    }
    
    public static void filtroAntiguo(){
        List<Operador> operadores = new ArrayList<Operador>();
        for(Operador op: lista){
            if(op.isActivo()){
                operadores.add(op);
            }
        }
        imprimir(operadores);
    }
    
    public static void imprimir(List<Operador> operador){
        System.out.println("------Lista filtrada-------");
        for(Operador op:lista){
            System.out.println("Nombre: "+op.getNombre()+" Clave: "+ op.getClave()+
                    " Estatus: "+ op.isActivo());
        }
    }
}
