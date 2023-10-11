package _06_Ke_thua._lop_circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getRadius()* 2* 3.14* height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "Hình trụ "
                +"\nRadius: " + super.getRadius()
                +"\nColor: " + super.getColor()
                +"\nHeight: " + height ;
    }
}
