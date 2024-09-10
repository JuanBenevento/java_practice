package model;

public class Bicicleta implements Transporte{
    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie, TipoTransporte tipoTransporte) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipoTransporte;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
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
        return 1;
    }

    public int ajustarAsiento(int altura){
        return altura;
    }

}
