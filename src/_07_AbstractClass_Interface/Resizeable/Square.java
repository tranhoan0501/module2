package _07_AbstractClass_Interface.Resizeable;

import _07_AbstractClass_Interface.Colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square(){
        super(1,1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeigth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side= "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Square have color of all four sides is: "+ getColor());
    }
}