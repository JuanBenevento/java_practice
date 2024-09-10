import model.Autobus;
import model.Bicicleta;
import model.TipoTransporte;
import model.Tranvia;


public class Main {
    public static void main(String[] args) {

        Autobus autobus1 = new Autobus(551, 30, TipoTransporte.AUTOBUS);
        Tranvia tranvia1 = new Tranvia("Ruta 5", 200, TipoTransporte.TRANVIA);
        Bicicleta bicicleta1 = new Bicicleta("Vairo rod.29", TipoTransporte.BICICLETA);

        autobus1.arrancar();
        tranvia1.arrancar();
        bicicleta1.arrancar();

        autobus1.detener();
        tranvia1.detener();
        bicicleta1.detener();

        autobus1.obtenerCapacidad();
        tranvia1.obtenerCapacidad();
        bicicleta1.obtenerCapacidad();

        
        System.out.println("Tipo de transporte: "+ autobus1.getTipo());



    }
}

/*
En la clase Main:
1. Crea instancias de cada clase (Autobus, Tranvía, Bicicleta).
2. Simula el arranque, la detención y la obtención de la capacidad de cada
transporte.
3. Muestra el tipo de transporte y el estado de cada uno en la consola.
 */