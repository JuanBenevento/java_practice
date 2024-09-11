package model;

import Interfaces.VehiculoCarga;

public class Camion extends Vehiculo implements VehiculoCarga {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int velMax) {
        super(marca, modelo, velMax);
    }


    @Override
    public int setCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void capacidadCarga(int capacidad) {
        this.capacidadCarga = capacidad;
    }
}
