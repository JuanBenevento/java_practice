import model.Autobus;
import model.Bicicleta;
import model.TipoTransporte;
import model.Tranvia;


public class Main {
    public static void main(String[] args) {

        Autobus autobus1 = new Autobus(551, 30, TipoTransporte.AUTOBUS);
        Tranvia tranvia1 = new Tranvia("Ruta 5", 200, TipoTransporte.TRANVIA);
        Bicicleta bicicleta1 = new Bicicleta("Vairo rod.29", TipoTransporte.BICICLETA);

        System.out.println("El autobus linea "+ autobus1.getNumeroLinea() +" "+ autobus1.arrancar());
        System.out.println("El autobus linea "+ autobus1.getNumeroLinea() +" llega a la parada "+ autobus1.anunciarParada("Casino Central"));
        System.out.println("El autobus "+ autobus1.detener());
        System.out.println("La capacidad del autobus es "+ autobus1.getCapacidad());
        System.out.println("Tipo de transporte: "+ autobus1.getTipo());

        System.out.println();

        System.out.println("El tranvia "+ tranvia1.getRuta() +" "+ tranvia1.arrancar());
        System.out.println("El tranvia "+ tranvia1.getRuta() +" modifica la via a ruta "+ tranvia1.cambiarVia(3));
        System.out.println("El tranvia "+ autobus1.detener());
        System.out.println("La capacidad del tranvia es "+ tranvia1.getCapacidad());
        System.out.println("Tipo de transporte: "+ tranvia1.getTipo());

        System.out.println();

        System.out.println("La bicicleta "+ bicicleta1.getNumeroSerie() +" "+ bicicleta1.arrancar());
        System.out.println("La bicicleta "+ autobus1.detener());
        System.out.println("El conductor de la bicicleta modifica la altura del asiento subiendola "+ bicicleta1.ajustarAsiento(20) +" cm");
        System.out.println("La capacidad de la bicicleta es "+ bicicleta1.obtenerCapacidad());
        System.out.println("Tipo de transporte: "+ bicicleta1.getTipo());



    }
}

/*
En la clase Main:
1. Crea instancias de cada clase (Autobus, Tranvía, Bicicleta).
2. Simula el arranque, la detención y la obtención de la capacidad de cada
transporte.
3. Muestra el tipo de transporte y el estado de cada uno en la consola.
 */