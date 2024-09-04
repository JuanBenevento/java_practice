import model.Empleado;
import model.CuentaBancaria;
import model.Libro;
import model.ItemVenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*1.
        //Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Empleado empleadoA = new Empleado("23456345", "Carlos", "Gutiérrez", 25000);

        //Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado empleadoB = new Empleado("34234123", "Ana", "Sánchez", 27500);

        // Imprima ambos objetos por pantalla.
        System.out.println(empleadoA.mostrarInformacion());
        System.out.println(empleadoB.mostrarInformacion());

        // Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo
        String salarioAumentado = empleadoA.calcularSalarioXporcentaje(15);

        double salarioAnual = empleadoA.calcularSalarioAnual();
        System.out.println("Salario Anual del "+ empleadoA.mostrarInformacion() +" es: " + salarioAnual);
        */

        /*2.
        //Inicialice una cuenta con un monto inicial de 15000.
        CuentaBancaria cuentaA = new CuentaBancaria("1", "Alberto Sanchez", 15000);

        // Realice una operación de crédito de 2500.
        double credito = cuentaA.credit(2500);
        System.out.println("El balance de la cuenta tras el credito seria: "+ credito);

        // Realice una operación de compra de 1500.
        double compra = cuentaA.debit(1500);
        System.out.println("El balance despues de la compra seria: "+ compra);

        // Realice una operación de compra de 30000.
        compra = cuentaA.debit(30000);

        // Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
        System.out.println(cuentaA.infoCuentaBancaria());
        */

        /*3.
        //a. Inicializa un libro con el título "El Quijote", autor "Miguel de Cervantes", precio 500, y 10 copias disponibles.
        Libro libroA = new Libro("El Quijote", "Miguel de Cervantes", 500, 10);

        //b. Inicializa otro libro con el título "Cien Años de Soledad", autor "Gabriel García Márquez", precio 700, y 5 copias disponibles.
        Libro libroB = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);

        //c. Imprime los detalles de ambos libros.
        System.out.println(libroA.mostrarInfo());
        System.out.println(libroB.mostrarInfo());

        //d. Vende 3 copias del primer libro.
        String venta = libroA.venderCopias(3);
        System.out.println(venta);

        //e. Imprime los detalles del primer libro.
        System.out.println(libroA.mostrarInfo());

        //f. Intenta vender 8 copias del segundo libro.
        String venta2 = libroB.venderCopias(8);
        System.out.println(venta2);

        //g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
        String aumentar = libroB.aumentarCopias(5);
        System.out.println(aumentar);

        //h. Imprime los detalles del segundo libro.
        System.out.println(libroB.mostrarInfo());
        */

        Scanner sc = new Scanner(System.in);
        ItemVenta item = null;
        boolean option = false;

        while(!option) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar ítem");
            System.out.println("2. Imprimir ítem");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Actualizar precio unitario");
            System.out.println("5. Imprimir precio total");
            System.out.println("6. Salir");

            int opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    // Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por el usuario
                    System.out.println("Ingrese el identificador: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la descripcion: ");
                    String descripcion = sc.nextLine();
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la precio por unidad: ");
                    double precioPorUnidad = sc.nextDouble();

                    item = new ItemVenta(id, descripcion, cantidad, precioPorUnidad);
                    System.out.println("Item cargado correctamente.");
                    break;
                case 2:
                    // Imprime el objeto usando el método correspondiente.
                    if(item != null) {
                        System.out.println(item.mostrarInfoItem());
                    } else {
                        System.out.println("Item no encontrado.");
                    }
                    break;
                case 3:
                    //Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.
                    if(item != null) {
                        System.out.println("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = sc.nextInt();
                        item.setCantidad(nuevaCantidad);
                        System.out.println("Nueva cantidad cargada exitosamente.");
                    }
                    break;
                case 4:
                    //Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo precioUnitario del ítem de venta.
                    System.out.println("Ingrese el nuevo precio unitario: ");
                    double nuevoPrecioUnitario = sc.nextDouble();
                    item.setPrecioUnitario(nuevoPrecioUnitario);
                    System.out.println("Precio unitario cargado correctamente.");
                    break;
                case 5:
                    //Imprime el precio total calculado por el método calcularTotal().
                    if(item != null) {
                        double precioTotal = item.calcularTotal();
                        System.out.println("El precio total es: " + precioTotal);
                    } else {
                        System.out.println("Item no encontrado.");
                    }
                    break;
                case 6:
                    //Sale del programa.
                    option = true;
                    break;
            }
        }
    }
}