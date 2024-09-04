package model;

public class Tranvia implements Transporte{
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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
    public void arrancar() {
        System.out.println("Arrancando...");
    }

    @Override
    public void detener() {
        System.out.println("Detenendo...");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public int cambiarVia(int nuevaVia){
        return nuevaVia;
    }

}
