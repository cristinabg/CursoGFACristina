
package modelos;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ac.barrios
 */
public class Auto extends Vehiculo {
    
    private String idAuto;
    private Double kilometros;
    private boolean vuela;
    private static int id;
    
    private static ArrayList<Auto> autos = new ArrayList();
    public Double getKilometros() {
        return kilometros;
    }

    public void setIdAuto() {
        this.idAuto = "a00"+id;
    }

    public void setKilometros(Double kilometros) {
        this.kilometros = kilometros;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public String getIdAuto() {
        return idAuto;
    }

    public boolean isVuela() {
        return vuela;
    }
    
    public Auto(String idVehiculo, String marca, String modelo, double costo, double kilometros, boolean vuela) {
        super(idVehiculo,marca, modelo, costo);
        this.idAuto = idVehiculo;
        this.kilometros = kilometros;
        this.vuela = vuela;
    }
    public Auto(){
    }
    
    @Override
    public void Registrar(){
         Scanner lectorString = new Scanner(System.in);
         Scanner lectorDouble = new Scanner(System.in);
         Scanner lectorBoolean = new Scanner(System.in);
         Auto a = new Auto();
         
         System.out.println("Ingresa marca: ");
         a.setMarca(lectorString.nextLine());
         
         System.out.println("Ingresa modelo: ");
         a.setModelo(lectorString.nextLine());
         
         System.out.println("Ingresa costo:");
         a.setCosto(lectorDouble.nextDouble());
         
         System.out.println("Ingresa kilometros");
         a.setKilometros(lectorDouble.nextDouble());
     
         System.out.println("Ingresa true sí vuela, de lo contrario false: ");
         a.setVuela(lectorBoolean.hasNext());
           
        autos.add(new Auto(a.getIdAuto(),a.getMarca(), a.getModelo(), a.getCosto(), a.getKilometros(), a.isVuela()));
         
       }
    
    @Override
    public void consultarTodo(){
        System.out.println("===============AUTOS===================");
          for(int valor = 0; valor<autos.size(); valor++){
             System.out.println(
                     "idAuto:"+ autos.get(valor).getIdAuto()+" "+
                     "Marca: "+ autos.get(valor).getMarca()+" "+
                     "Modelo: " + autos.get(valor).getModelo()+" "+
                     "Costo: " + autos.get(valor).getCosto() +" "+
                     "Kilometros: "+ autos.get(valor).kilometros+" "+
                     "Vuela: "+ autos.get(valor).vuela);
         }
        System.out.println("=======================================");
    }
    
}
