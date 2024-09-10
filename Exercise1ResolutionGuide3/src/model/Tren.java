package model;

public class Tren implements Transporte{
    @Override
    public String arrancar() {
        return "Arrranca";
    }

    @Override
    public String detener() {
        return "Frena";
    }

    @Override
    public int obtenerCapacidad() {
        return 0;
    }
}
