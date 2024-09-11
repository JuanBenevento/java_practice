import SistemaGestion.Gestor;
import model.Autobus;
import model.Automovil;
import model.Camion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gestor gestionVehiculos = new Gestor();

        Automovil auto = new Automovil("Toyota", "Corolla", 250);
        Autobus autobus = new Autobus("Mercedez Benz", "Citaro", 100);
        Camion camion = new Camion("Volvo", "FM", 100);

        auto.cantidadPasajeros(5);
        autobus.cantidadPasajeros(90);
        camion.capacidadCarga(50);

        gestionVehiculos.agregarVehiculo(auto);
        gestionVehiculos.agregarVehiculo(autobus);
        gestionVehiculos.agregarVehiculo(camion);

        gestionVehiculos.mostrarVehiculos();
    }
}