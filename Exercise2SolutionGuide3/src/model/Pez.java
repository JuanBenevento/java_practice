package model;

public class Pez extends Animal implements Acuatico{

    public Pez(String nombre) {
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
    public String nadar() {
        return "";
    }

    @Override
    public String sumergirse() {
        return "";
    }
}

