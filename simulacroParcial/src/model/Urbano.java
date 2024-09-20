package model;

public class Urbano extends Automovil{
    private int cantidadOcup;

    public Urbano(String modelo, double precio, TipoVehiculo tipo, int maximoAirbag, int cantidadOcup) {
        super(modelo, precio, tipo, maximoAirbag);
        this.cantidadOcup = cantidadOcup;
    }

    public int getCantidadOcup() {
        return cantidadOcup;
    }

    public void setCantidadOcup(int cantidadOcup) {
        this.cantidadOcup = cantidadOcup;
    }

    @Override
    public String mostrarInfo() {
        return " "+ getTipo() +": "+ getModelo() +", Precio: "+ getPrecio() +" us$, Cantidad de Ocupantes: "+ getCantidadOcup();
    }

    @Override
    public double actualizarPrecio(double porcentaje) {
        return precio = precio + precio*porcentaje/100;
    }

}
