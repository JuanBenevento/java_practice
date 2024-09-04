package model;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        this.height = 1.0;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return super.calculateArea() * height;

    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * height + 2 * super.calculateArea();
    }

    public String toString() {
        return "Cylinder: subclase of "+ super.toString() + " height = " + height;
    }
}
