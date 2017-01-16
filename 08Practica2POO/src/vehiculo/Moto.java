package vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ac.barrios
 */
public class Moto extends Vehiculo {

    public int anio;
    public String tipo;
    private static ArrayList<Moto> moto = new ArrayList();

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Moto(String marca, String modelo, Double costo, int anio, String tipo) {
        super(marca, modelo, costo);
        this.anio = anio;
        this.tipo = tipo;
    }
    
    public Moto(){}
    
     @Override
    public void Registrar(){
         Scanner lectorString = new Scanner(System.in);
         Scanner lectorDouble = new Scanner(System.in);
         Scanner lectorInt = new Scanner(System.in);
         Moto m = new Moto();
         
         System.out.println("Ingresa marca: ");
         m.setMarca(lectorString.nextLine());
         System.out.println("Ingresa modelo: ");
         m.setModelo(lectorString.nextLine());
         System.out.println("Ingresa costo:");
         m.setCosto(lectorDouble.nextDouble());
         System.out.println("Ingresa año:");
         m.setAnio(lectorInt.nextInt());
         System.out.println("Ingresa tipo: ");
         m.setTipo(lectorString.nextLine());
        
         moto.add(new Moto(m.getMarca(),m.getModelo(),m.getCosto(),m.getAnio(),m.getTipo()));
       }
    
    @Override
    public void consultarTodo(){
        System.out.println("================MOTOS=================");
        for(int valor = 0; valor < moto.size(); valor++) {
            System.out.println(
                    "Marca: " + moto.get(valor).getMarca() + " "
                    + "Modelo: " + moto.get(valor).getModelo() + " "
                    + "Costo: " + moto.get(valor).getCosto() + " "
                    + "Año: " + moto.get(valor).anio + " "
                    + "Tipo: " + moto.get(valor).tipo);
        }
        System.out.println("=======================================");
    }
}
