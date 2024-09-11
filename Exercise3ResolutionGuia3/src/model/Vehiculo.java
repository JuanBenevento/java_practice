package model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velMax;

    public Vehiculo(String marca, String modelo, int velMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }
}
