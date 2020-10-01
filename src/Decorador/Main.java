package Decorador;
import Decorador.CarroEstandar;


public class Main {
    public static void main (String[] args){


        Automovil carro =/**new AutoElectricoFeature(new CarroEstandar ("Chevy");)*/ new CarroEstandar ("Chevy");
        carro.start();
        carro.acceleration();
        carro.stop();


    }

}
