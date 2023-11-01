package _10_DSA_ArrayList_LinkedList.LinkedList;

public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.print("Danh sách: ");
        myList.printList();

        myList.addFirst(0);
        myList.addLast(4);

        System.out.print("Danh sách sau khi thêm vào đầu tiên và cuối cùng: ");
        myList.printList();

        myList.remove(2);

        System.out.print("Danh sách sau khi xóa ở chỉ mục 2: ");
        myList.printList();

        myList.remove((Object) 0);

        System.out.print("Danh sách sau khi xoá 0: ");
        myList.printList();

        System.out.println("Phần tử ở chỉ số 2: " + myList.get(2));
        System.out.println("Kích thước của dánh sách: " + myList.size());

        MyLinkedList newList = myList.clone();
        System.out.print("Danh sách nhân bản: ");
        newList.printList();

        System.out.println("Danh sách chứa 3: " + myList.contains(3));
        System.out.println("Chỉ số 2: " + myList.indexOf(2));
    }
}
