/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

import java.util.ArrayList;
import modelo.Corrida;
import coleccion.CorridaIterator;
/**
 *
 * @author ac.barrios
 */
public class ListadoCorridas {
   private ArrayList<Corrida> lista = new ArrayList<Corrida>();
   private String nombre;

    public ArrayList<Corrida> getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLista(ArrayList<Corrida> lista) {
        this.lista = lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   public CorridaIterator iterator(){
       return new CorridaIterator(lista);
   }
   
   
}
