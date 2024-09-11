package model;

public class Pato extends Animal implements Acuatico, Aereo, Terrestre{

    public Pato(String nombre) {
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

    @Override
    public String volar() {
        return "";
    }

    @Override
    public String caminar() {
        return "";
    }
}
