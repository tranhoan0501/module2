package _04_Lop_va_doi_tuong;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed ;
    private boolean isOn ;
    private double radius ;
    private String color ;
    public Fan() {
        this.isOn = false;
        this.speed = SLOW;
        this.radius = 10;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (this.isOn){
            return  "fan is on, " + "Speed " +this.getSpeed() + ", Color " + this.getColor() + ", Radius " +this.getRadius();
        }else {
            return  "fan is off, " + "Color " +this.getColor() +", Radius " +this.getRadius();
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("Red");

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("Black");

        System.out.println("Thông tin Fan 1:" + fan1.toString());
        System.out.println("Thông tin Fan 2:" + fan2.toString());


    }
}

