package model;

import java.util.UUID;

public class Client {

    private String idClient;
    private String name;
    private String email;
    private int discount;

    public Client(String name, String email, int discount) {
        this.idClient = generateUniqueId();
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    private String generateUniqueId(){
        return UUID.randomUUID().toString();
    }

    public String getIdClient() {
        return idClient;
    }
    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient='" + idClient + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                "%}";
    }
}




/*
Nos contratan para hacer un programa que lleve el control de las ventas
de un local. Para esto es necesario modelar la clase Cliente, que posee un
atributo id como identificador del cliente, el mismo debe ser un valor
compuesto por letras y números aleatorios que se generan
automáticamente al crear un Cliente. El Cliente también posee un nombre,
un email y un porcentaje de descuento.
 */