/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15ejemplohilos;

/**
 *
 * @author ac.barrios
 */
public class Autobus {
    private int numerAutobus;
    private String origen,destino;
    private int[] tiempos;
            
            
    public Autobus(int numerAutobus, String origen, String destino, int[] tiempos) {
        this.numerAutobus = numerAutobus;
        this.origen = origen;
        this.destino = destino;
        this.tiempos = tiempos;
    }

    public int getNumerAutobus() {
        return numerAutobus;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int[] getTiempos() {
        return tiempos;
    }

    public void setNumerAutobus(int numerAutobus) {
        this.numerAutobus = numerAutobus;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setTiempos(int[] tiempos) {
        this.tiempos = tiempos;
    }
    
    
}
