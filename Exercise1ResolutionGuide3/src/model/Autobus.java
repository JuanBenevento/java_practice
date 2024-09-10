package model;

public class Autobus implements Transporte{
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo) {
       this.numeroLinea = numeroLinea;
       this.capacidad = capacidad;
       this.tipo = tipo;
   }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String arrancar() {
        return "Arranca";
    }

    @Override
    public String detener() {
        return "Frena";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public String anunciarParada(String parada) {
        return parada;
    }

}
