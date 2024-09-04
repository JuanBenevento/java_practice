package model;

import java.util.ArrayList;

public class Staff extends Person {
    private double salary;
    private String shift;

    public Staff(int dni, String name, String surname, String email, String Address, double salary, String shift) {
        super(dni, name, surname, email, Address);
        this.salary = salary;
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}
