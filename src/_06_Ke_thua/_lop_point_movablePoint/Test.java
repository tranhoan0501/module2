package _06_Ke_thua._lop_point_movablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(3,4,5,6);
        System.out.println(movablePoint.move());
    }
}
