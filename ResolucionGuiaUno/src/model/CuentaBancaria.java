package model;

public class CuentaBancaria {
    //atributos
    private String identificador;
    private String nombre;
    private double balance;

    //constructor
    public CuentaBancaria(String identificador, String nombre, double saldo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = saldo;
    }

    //get a set
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //metodo credito
    public double credit(double credito) {
        balance += balance + credito;
        return balance;
    }

    //metodo debito
    public double debit(double debito) {
        if (balance > debito) {
            balance -= balance - debito;
        } else {
            System.out.println("No es posible realizar esta operacion, saldo insuficiente.");
        }
        return balance;
    }

    //metodo mostrar info
    public String infoCuentaBancaria(){
        return "Cuenta { Identificador: "+ identificador +", Nombre: "+ nombre +" , Balance: "+ balance +" }";
    }

}