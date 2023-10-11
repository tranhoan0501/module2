package _06_Ke_thua._Lop_Triangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 4.0, 3.0,"Red");
        System.out.println("Diện tích tam giác: " + triangle.getArea());
        System.out.println("Chu vi tam giác: " + triangle.getPerimeter());
        System.out.println("Thông tin tam giác: " + triangle);
        System.out.println("Màu: "+triangle.getColor());
    }
}
