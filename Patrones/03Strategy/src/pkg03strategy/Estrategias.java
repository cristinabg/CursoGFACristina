package pkg03strategy;
import pkg03strategy.Matematicas;

class Suma implements Matematicas{
    @Override 
    public float operacion(float a, float b){
        return a+b;
    }
}

class Resta implements Matematicas{
    @Override 
    public float operacion(float a, float b){
        return a-b;
    }
}

class Multiplicacion implements Matematicas{
    @Override 
    public float operacion(float a, float b){
        return a+b;
    }
}

class Division implements Matematicas{
    @Override 
    public float operacion(float a, float b){
        return a/b;
    }
}