import model.*;
import service.ServiceVehiculo;

public class Main {
    public static void main(String[] args) {
        ServiceVehiculo inventario = new ServiceVehiculo();

        Utilitario utilitario = new Utilitario("Fiat Fiorino", 15000, TipoVehiculo.UTILITARIO, 3500, 185);
        Urbano urbano = new Urbano("Toyota Corolla", 20000, TipoVehiculo.URBANO, 4, 5);
        Carrera carrera = new Carrera("Mustang GTI", 50000, TipoVehiculo.CARRERA, 4, 300);
        Motocicleta moto = new Motocicleta("Honda CB1", 50000, TipoVehiculo.MOTOCICLETA, 1000);

        inventario.agregarVehiculo(utilitario);
        inventario.agregarVehiculo(urbano);
        inventario.agregarVehiculo(carrera);
        inventario.agregarVehiculo(moto);

        inventario.mostrarInventario();
        System.out.println();

        inventario.modificarPrecio(10, 15, 20, 5);

        System.out.println("Los valores de los precios actualizados son: ");
        System.out.println();

        inventario.mostrarInventario();

    }
}