package _07_AbstractClass_Interface.Colorable;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String isFilled= isFilled()? "filled":"not filled";
        return "A Shape with color of "+ color+ " and "+ isFilled;
    }
}
