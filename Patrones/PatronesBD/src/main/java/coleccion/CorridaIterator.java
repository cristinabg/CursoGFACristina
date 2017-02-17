/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import modelo.Corrida;

/**
 *
 * @author ac.barrios
 */
public class CorridaIterator implements Iterator<Corrida> {

    private int index;
    private ArrayList<Corrida> lista;

    public CorridaIterator(ArrayList<Corrida> lista) {
        this.index = 0;
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return index < lista.size() && lista.get(index) != null;
    }

    @Override
    public Corrida next() {
        if (hasNext())
            return lista.get(index++);
        return null;
    }

    @Override
    public void forEachRemaining(Consumer<? super Corrida> action) {
       for(int i = index; i<lista.size(); i++){
           action.accept(lista.get(i));
       }
    }

}
