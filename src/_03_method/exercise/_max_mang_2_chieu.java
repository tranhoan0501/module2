package _03_method.exercise;

import java.util.Scanner;

public class _max_mang_2_chieu {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của ma trận: ");
        x = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        y = scanner.nextInt();
        int[][] A = new int[x][y];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
