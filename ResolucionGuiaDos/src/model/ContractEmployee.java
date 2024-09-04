package model;

public class ContractEmployee extends Employee {
    private int hoursWorked;
    private double projectRate;

    public ContractEmployee(String name, double projectRate, int hoursWorked) {
        super(name, projectRate * hoursWorked);
        this.hoursWorked = hoursWorked;
        this.projectRate = projectRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getProjectRate() {
        return projectRate;
    }
    public void setProjectRate(double projectRate) {
        this.projectRate = projectRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * projectRate;
    }
}