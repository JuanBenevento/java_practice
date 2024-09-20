package model;

public class Utilitario extends Vehiculo{
    private double capacidadCarga;
    private double altura;

    public Utilitario(String modelo, double precio, TipoVehiculo tipo, double capacidadCarga, double altura) {
        super(modelo, precio, tipo);
        this.capacidadCarga = capacidadCarga;
        this.altura = altura;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String mostrarInfo() {
        return " "+ getTipo() +": "+ getModelo() +", Precio: "+ getPrecio() +" us$, Capacidad de carga: "+ getCapacidadCarga() +" Kg, Altura: "+ getAltura() +" Cm";
    }

    @Override
    public double actualizarPrecio(double porcentaje) {
        return precio = precio + precio * porcentaje/100;
    }

}
