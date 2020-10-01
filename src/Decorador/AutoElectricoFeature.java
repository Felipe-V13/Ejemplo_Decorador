package Decorador;

public class AutoElectricoFeature extends AutomovilDecorador{
    public AutoElectricoFeature(Automovil auto){
        super (auto);
    }
    @Override
    public void acceleration(){
        System.out.println("iniciando electricamente");
        getAuto().acceleration();

    }

    @Override
    public void stop(){
        System.out.println("controlando frenos electrónicos");
        getAuto().stop();
    }
    @Override
    public void start() {
        System.out.println("iniciar sistema operativo del carro");
        getAuto().start();
    }
}
