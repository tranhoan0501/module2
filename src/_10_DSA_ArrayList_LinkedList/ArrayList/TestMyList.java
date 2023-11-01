package _10_DSA_ArrayList_LinkedList.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        // myList.remove(0);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(2,10);



        System.out.println("Giá trị trong mảng: " + myList.get(0));// xuất ra giá trị
        System.out.println("Giá trị trong mảng: " + myList.get(1));
        System.out.println("Giá trị trong mảnh: " + myList.get(2));
        System.out.println(myList.indexOf(5));// tìm vị trí của chuỗi
        System.out.println(myList.contains(10));// tìm thử ký tự đó có trong 1 chuỗi hay không
        System.out.println("Số lượng trong mảng: "+myList.size());//kiểm tra số lượng mảng
    }
}
