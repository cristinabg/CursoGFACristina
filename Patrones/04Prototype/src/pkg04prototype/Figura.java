/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04prototype;

/**
 *
 * @author ac.barrios
 */
public abstract class Figura implements Cloneable {
    protected String tipo;
    private int id;
    
   public abstract void  Dibujar();

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public Object clone(){
        Object clon = null;
        try{
            clon = super.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clon;
    }
}
