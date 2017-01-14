/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ac.barrios
 */
public class Error implements IEscribible {

    private long timeStamp;
    private int codigoError;
    private String descripcionError;

    public Error(){
        
    }
    
    @Override
    public String toString(){
         String lineaError = timeStamp + " | " + codigoError + " | " + descripcionError;
         return lineaError;
    }
    @Override
    public void escribir(String url) {
        try {
            FileOutputStream fO = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter(fO, "utf-8");
            BufferedWriter bW = new BufferedWriter(oS);
            String lineaError = timeStamp + "|" + codigoError + "|" + descripcionError + "/n";
            bW.write(lineaError);
            bW.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Tipo de codificación no soportada");
        } catch (IOException ex) {
            System.out.println("Error al ingresar un valido no valido");
        } catch (Exception ex) {
            System.out.println("Error");
        }

    }
//    public void escribir(String url){
//        FileWriter escribeArchivo;
//        try {
//            escribeArchivo = new FileWriter(url, true);
//            String lineaError = timeStamp + " | " + codigoError + " | " + descripcionError + "\n";
//            escribeArchivo.append(lineaError);
//            escribeArchivo.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("El archivo no existe");
//        }
//    }

    @Override
    public IEscribible leer(String url, long timeStamp) {

        try {
            FileReader fR = new FileReader(url);
            BufferedReader bR = new BufferedReader(fR);
            String leer;
            while((leer = bR.readLine()) != null){
               String [] error = leer.split("-");
               String time = timeStamp+" ";
               if((error[0].trim()).equals(time.trim())){
                   this.timeStamp = Long.parseLong(error[0].trim());
                   this.codigoError = Integer.parseInt(error[1].trim());
                   this.descripcionError = error[2].trim();
                   return this;
               }
            }
            bR.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public long getTimestamp() {
        return timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setTimestamp(long timestamp) {
        this.timeStamp = timestamp;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public Error(int codigoError, String descripcionError) {
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcionError = descripcionError;
    }

}
