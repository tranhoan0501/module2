package _07_AbstractClass_Interface.Resizeable;

public class Circle extends Shape{
    private double radius;
    public Circle() {
        radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return
                "Radius: " + radius +
                        "\nĐó là lớp con của: " + super.toString();
    }

    @Override
    public void resize(double increasePercent) {
        double tmp= radius * increasePercent/100;
        radius += tmp;
    }
}
