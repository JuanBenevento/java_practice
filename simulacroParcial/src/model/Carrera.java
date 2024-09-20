package model;

import interfaces.IDeportivo;

public class Carrera extends Automovil implements IDeportivo {
    private double velocidadMax;

    public Carrera(String modelo, double precio, TipoVehiculo tipo, int maximoAirbag, double velocidadMax) {
        super(modelo, precio, tipo, maximoAirbag);
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public void competirEnPista() {
        System.out.println("El auto de carrera puede competir en pista");
    }


    @Override
    public String mostrarInfo() {
        return " "+ getTipo() +": "+ getModelo() +", Precio: " + getPrecio() +" us$, Velocidad Max: " + getVelocidadMax() +" Km/h";
    }

    @Override
    public double actualizarPrecio(double porcentaje) {
        return precio = precio + precio*porcentaje/100;
    }
}
