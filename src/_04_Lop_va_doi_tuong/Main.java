package _04_Lop_va_doi_tuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        _lop_hinh_chu_nhat hinhchunhat = new _lop_hinh_chu_nhat(width, height);
        System.out.println("Your Rectangle \n" + hinhchunhat.display());
        System.out.println("Perimeter of the Rectangle: " + hinhchunhat.getPerimeter());
        System.out.println("Area of the Rectangle: " + hinhchunhat.getArea());
    }
}
