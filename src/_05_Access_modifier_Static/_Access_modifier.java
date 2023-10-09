package _05_Access_modifier_Static;

public class _Access_modifier {
    private double radius = 1.0;
    private String color = "Red";
    public _Access_modifier() {
    }
    public _Access_modifier(double radius) {
        this.radius = radius;
    }

    // Phương thức getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Phương thức setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        _Access_modifier Circle = new _Access_modifier();
        System.out.println("Ban kinh hinh tron la : "+Circle.getRadius()+" \nS cua hinh tron la "+Circle.getArea()+" \nmau cua hinh tron la "+Circle.getColor());
        System.out.println("------------------------------------------");
        Circle.setRadius(7);
        Circle.setColor("Blue");
        System.out.println("Ban kinh hinh tron la : "+Circle.getRadius()+" \nS cua hinh tron la "+Circle.getArea()+" \nmau cua hinh tron la "+Circle.getColor());

    }
}

