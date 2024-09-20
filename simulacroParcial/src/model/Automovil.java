package model;

public abstract class Automovil extends Vehiculo {
    protected int maximoAirbag;

    public Automovil(String modelo, double precio, TipoVehiculo tipo, int maximoAirbag) {
        super(modelo, precio, tipo);
        this.maximoAirbag = maximoAirbag;
    }

    public int getMaximoAirbag() {
        return maximoAirbag;
    }

    public void setMaximoAirbag(int maximoAirbag) {
        this.maximoAirbag = maximoAirbag;
    }
}
