package model;

public class Person {
    private int dni;
    private String name;
    private String surname;
    private String email;
    private String Address;

    public Person(int dni, String name, String surname, String email, String Address) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.Address = Address;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}
