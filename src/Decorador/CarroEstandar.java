package Decorador;

public class CarroEstandar implements Automovil {
    private String nombre;

    public CarroEstandar(String s){
    nombre = s;
    }

    @Override
    public void acceleration(){
        System.out.println("aceleración estandar");
    }

    @Override
    public void stop(){
        System.out.println("Frenar");
    }
    @Override
    public void start(){
        System.out.println ("prendiendo el carro");
    }
}