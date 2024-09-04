package model;

public class ItemVenta {
    //atributos
    int identificador;
    String descripcion;
    int cantidad;
    double precioUnitario;

    //constructor
    public ItemVenta(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //get and set
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    //metodo precio total
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    //metodo que devuelva una representación en cadena del ítem de venta
    public String mostrarInfoItem() {
        return "Libro { " + "Id= " + identificador + ", Descripcion= " + descripcion + ", Cantidad= '" + cantidad + ", Precio Unidad= " + precioUnitario + ", Precio total= " + calcularTotal() + " }";
    }

}