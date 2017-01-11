
package operaciones;

public class Operaciones {
    
    public static int suma(int[] numeros){
        int acumulado = 0;
        int suma = 0;
        for(int valor = 0; valor<numeros.length; valor++){
            acumulado = numeros[valor];
            suma = suma + acumulado;
        }
        return suma;
    }
    
    public static int media(int[] numeros){
        int acumulado = suma(numeros);
        return acumulado/numeros.length;
    }
    
    public static int mayor(int[] numeros){
        int numeroMayor = 0;
        for(int valor = 0; valor<numeros.length; valor++){
            for(int valorInterno = 1; valorInterno<numeros.length; valorInterno++){
                int numeroActual = numeros[valorInterno];
                int numeroAnterior = numeros[valor];
                if(numeroAnterior > numeroActual){
                    numeroMayor = numeroAnterior;
                }
            }
        }
        return numeroMayor;
    }
}
