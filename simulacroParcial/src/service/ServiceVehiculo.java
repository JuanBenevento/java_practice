package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceVehiculo {
    private List<Vehiculo> inventario;

    public ServiceVehiculo() {
        this.inventario = new ArrayList<Vehiculo>();
    }

    public List<Vehiculo> getInventario() {
        return inventario;
    }

    public void setInventario(List<Vehiculo> inventario) {
        this.inventario = inventario;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.inventario.add(vehiculo);
    }

    public void mostrarInventario() {
        for (Vehiculo vehiculo : inventario) {
            System.out.println(vehiculo.mostrarInfo());
        }
    }

    public List<Vehiculo> modificarPrecio(double porcentajeUtilitario, double porcentajeUrbano, double porcentajeCarrera, double porcentajeMoto) {
        for (Vehiculo vehiculo : inventario) {
            if (vehiculo instanceof Utilitario)
                vehiculo.actualizarPrecio(porcentajeUtilitario);
            if (vehiculo instanceof Urbano)
                vehiculo.actualizarPrecio(porcentajeUrbano);
            if (vehiculo instanceof Carrera)
                vehiculo.actualizarPrecio(porcentajeCarrera);
            if (vehiculo instanceof Motocicleta)
                vehiculo.actualizarPrecio(porcentajeMoto);
        }
        return inventario;
    }

}
