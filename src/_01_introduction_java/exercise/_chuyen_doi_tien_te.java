package _01_introduction_java.exercise;

import java.util.Scanner;

public class _chuyen_doi_tien_te {
        public static void main(String[] args) {
            double usd;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Nhập số tiền USD:");
            usd = sc.nextDouble();
            double quydoi = usd * 23000;
            System.out.print("Số tiền USD chuyển sang VND là: "+ quydoi);
        }
    }

