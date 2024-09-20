package model;

public abstract class Vehiculo {
    protected String modelo;
    protected double precio;
    protected TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, double precio, TipoVehiculo tipo) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public abstract String mostrarInfo();

    public abstract double actualizarPrecio(double porcentaje);
}
