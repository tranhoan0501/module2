package _03_method.practice;

import java.util.Scanner;

public class _dao_nguoc_mang {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap size mang: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Size vuot qua muc cho phep");
            }
        }while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Nhap phan tu thu "+ (i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        //In ra mảng đã nhập
        System.out.printf("%-20s%s", "Mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Đảo ngược thứ tự các phần tử trong mảng
        //Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử.
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
