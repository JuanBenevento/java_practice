package SistemaGestion;

import Interfaces.VehiculoCarga;
import Interfaces.VehiculoPasajeros;
import model.Vehiculo;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Vehiculo> vehiculos;

    public Gestor() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() +
                    " \nModelo: " + vehiculo.getModelo() +
                    " \nVel. Maxima: "+ vehiculo.getVelMax() +" km/h");
            if(vehiculo instanceof VehiculoPasajeros){
                System.out.println("Cantidad de pasajeros: "+ ((VehiculoPasajeros) vehiculo).setCantidadPasajeros());
            } if(vehiculo instanceof VehiculoCarga){
                System.out.println("Capacidad de carga: "+ ((VehiculoCarga) vehiculo).setCapacidadCarga() +" Toneladas");
            }

            System.out.println();
        }
    }

}
