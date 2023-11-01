package _07_AbstractClass_Interface.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(5, "red", true);
        arr[1] = new Rectangle("yellow", false, 5, 9);
        arr[2] = new Square(15, "blue", false);
        for(Shape shape : arr){
            System.out.println(shape.getClass().getSimpleName()+", với chu vi "+shape.getPerimeter());
            System.out.println("----------------");
            if(shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }
    }
}

