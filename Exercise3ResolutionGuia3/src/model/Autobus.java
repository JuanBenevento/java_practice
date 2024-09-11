package model;

import Interfaces.VehiculoPasajeros;

public class Autobus extends Vehiculo implements VehiculoPasajeros {
    private int cantidadPasajeros;

    public Autobus(String marca, String modelo, int velMax) {
        super(marca, modelo, velMax);
    }

    @Override
    public int setCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public void cantidadPasajeros(int cantidad) {
        this.cantidadPasajeros = cantidad;
    }
}
