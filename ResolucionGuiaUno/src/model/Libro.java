package model;

public class Libro {
    //atributos
    private static int contadorId = 0; // Variable estática para autoincrementar el ID
    private int idLibro;
    private String titulo;
    private String autor;
    private double precio;
    public int copiasDisponibles;

    //constructor
    public Libro(String autor, String titulo, double precio, int copiasDisponibles) {
        this.idLibro = ++contadorId; // Autoincrementa el ID
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copiasDisponibles = copiasDisponibles;
    }

    //get and set
    public static int getContadorId() {
        return contadorId;
    }
    public static void setContadorId(int contadorId) {
        Libro.contadorId = contadorId;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }
    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    // Un método que permita vender una cierta cantidad de copias de un libro, disminuyendo la cantidad disponible.
    // Si no hay suficientes copias, debe mostrar un mensaje indicando que la operación no es posible.
    public String venderCopias (int copiasDemandadas){
        String mensaje;

        if (copiasDemandadas > 0) {
            int copiasRestantes = copiasDisponibles - copiasDemandadas;

            if (copiasRestantes >= 0) {
                copiasDisponibles -= copiasDemandadas;
                mensaje = "La venta fue exitosa";
            } else {
                mensaje = "No es posible vender esa cantidad de copias";
            }
        } else {
            mensaje = "No es posible vender una cantidad inferior a 1";
        }
        return mensaje;
    }

    //Un método que permita incrementar la cantidad de copias disponibles en el inventario
    public String aumentarCopias (int copiasAgregadas){
        String mensaje;

        if (copiasAgregadas > 0){
            copiasDisponibles += copiasAgregadas;
            mensaje = "Las copias fueron agregadas satisfactoriamente.";
        } else {
            mensaje = "No se pueden agregar copias con valores iguales o menores a 0";
        }
        return mensaje;
    }

    // Método que facilita mostrar la información
    public String mostrarInfo() {
        return "Libro { " +
                "Id= " + idLibro +
                ", Titulo= '" + titulo + '\'' +
                ", Autor= '" + autor + '\'' +
                ", Precio= " + precio +
                ", CopiasDisponibles= " + copiasDisponibles +
                " }";
    }
}

