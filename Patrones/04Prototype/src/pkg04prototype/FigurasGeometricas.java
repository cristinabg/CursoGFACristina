/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04prototype;
import pkg04prototype.Figura;

class Rectangulo extends Figura{
    public Rectangulo(){
        tipo="Rectangulo";
    }
    @Override
    public void Dibujar(){
        System.out.println("Soy un Rectangulo");
    }
}

class Cuadrado extends Figura{
    public Cuadrado (){
        tipo ="Cuadrado";
    }
    @Override
    public void Dibujar(){
        System.out.println("Soy un Cuadrado");
    }
}

class Circulo extends Figura{
    public Circulo(){
        tipo = "Circulo";
    }
    @Override
    public void Dibujar(){
        System.out.println("Soy un Circulo");
    }
}

class Rombo extends Figura{
    public Rombo(){
        tipo = "Rombo";
    }
    @Override
    public void Dibujar(){
        System.out.println("Soy un Rombo");
    }
}
