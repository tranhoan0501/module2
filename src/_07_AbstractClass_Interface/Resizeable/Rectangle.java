package _07_AbstractClass_Interface.Resizeable;

public class Rectangle extends Shape{
    private double width;
    private double heigth;

    public Rectangle() {
        width = 1;
        heigth = 1;
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea() {
        return width * heigth;
    }

    public double getPerimeter() {
        return 2 * (width + heigth);
    }

    public abstract void setHeight(double height);

    @Override
    public String toString() {
        return "width: " + width +
                "\nheigth: " + heigth +
                "\nĐó là lớp con của: " + super.toString();
    }

    @Override
    public void resize(double increasePercent) {
        width += width * increasePercent/100;
        heigth += heigth * increasePercent/100;
    }
}
