package model;

public class Murcielago extends Animal implements Aereo{


    public Murcielago(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return "";
    }

    @Override
    public String dormir() {
        return "";
    }

    @Override
    public String emitirSonido() {
        return "";
    }

    @Override
    public String volar() {
        return "";
    }

    public String colgarse(){
        return "";
    }

}
