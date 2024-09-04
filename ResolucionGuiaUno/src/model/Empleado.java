package model;

public class Empleado {
    //atributos
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    //constructor
    public Empleado(String dni, String nombre, String apellido, double salario) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;

    }

    //get and set
    public String getDni(){
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodo para calcular salario anual
    public double calcularSalarioAnual(){
        return salario*12;
    }

    //metodo para calcular el salario multiplicado por un porcentaje
    public String calcularSalarioXporcentaje(double porcentaje){
        String mensaje;

        if (0 < porcentaje){
            salario += salario*(porcentaje/100);
            mensaje = "Salario Anual actualizado: " + salario;
        } else {
            mensaje = "El porscentaje debe ser mayor a 0.";
        }

        return mensaje;
    }

    //metodo para imprimir por pantalla las caracteristicas del objeto 'empleado'
    public String mostrarInformacion(){
        return "Empleado { "+"DNI: "+dni+", Nombre: "+nombre+", Apellido: "+apellido+", Salario: "+salario+" }";
    }
}