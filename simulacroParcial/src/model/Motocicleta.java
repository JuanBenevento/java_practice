package model;

import interfaces.IDeportivo;

public class Motocicleta extends Vehiculo implements IDeportivo {

    private double cilindrada;

    public Motocicleta(String modelo, double precio, TipoVehiculo tipo, double cilindrada) {
        super(modelo, precio, tipo);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void competirEnPista() {
        System.out.println("La motocicleta puede competir pista");
    }

    @Override
    public String mostrarInfo() {
        return " "+ getTipo() + ": " + getModelo() + ", Precio: " + getPrecio() + " us$, Cilindrada: " + getCilindrada() +" Cc";
    }

    @Override
    public double actualizarPrecio(double porcentaje) {
        return precio = precio + precio*porcentaje/100;
    }
}
