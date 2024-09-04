package model;

import java.util.ArrayList;

public class Student extends Person {
    private int yearEntry;
    private double monthlyFee;
    private String career;


    public Student(int dni, String name, String surname, String email, String Address, int yearEntry, double monthlyFee, String career) {
        super(dni, name, surname, email, Address);
        this.yearEntry = yearEntry;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public int getYearEntry() {
        return yearEntry;
    }

    public void setYearEntry(int yearEntry) {
        this.yearEntry = yearEntry;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

}
