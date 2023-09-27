package _03_method.exercise;

import java.util.Scanner;

public class _min_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Nhập số lượng phần tử < 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Phân tử thứ "+(i+1)+": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng đã nhập: ");
        for ( i = 0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.print("\n");
        int min = array[0];
        int index = 1;
        for ( i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i + 1;
            }
        }

        System.out.println("Mảng nhỏ nhất " + min + " ,ở vị trí " + index);
    }
}
