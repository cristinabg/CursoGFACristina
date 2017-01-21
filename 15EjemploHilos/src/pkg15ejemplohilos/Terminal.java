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
public class Terminal implements Runnable{
    private Autobus autobus;
    private long tiempoInicial;
    private static String[] mensajes = {"Ascenso", "Espera", "Descenso"};
    
    public Terminal(Autobus autobus, long tiempoInicial) {
        this.autobus = autobus;
        this.tiempoInicial = tiempoInicial;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {
        System.out.println("Autobus con el Numero: "
                + autobus.getNumerAutobus()+
                " se comenzo en el tiempo: "+ ((System.currentTimeMillis() - tiempoInicial)/1000));
        for(int i=0; i<autobus.getTiempos().length; i++){
            esperarSegundos(autobus.getTiempos()[i]);
           
            System.out.println(mensajes[i] + " : "+ autobus.getNumerAutobus()+ 
                    " | tiempo: "+ ((System.currentTimeMillis() - tiempoInicial)/1000));
        }
        System.out.println("El autobús con el número: "+ autobus.getNumerAutobus()+ 
                " partio a su destino "+ autobus.getDestino());
    }
    
    private void esperarSegundos(int seg){
        try {
            Thread.sleep(seg*1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
