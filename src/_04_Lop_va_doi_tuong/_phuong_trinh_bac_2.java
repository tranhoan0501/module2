package _04_Lop_va_doi_tuong;

import java.util.Scanner;

public class _phuong_trinh_bac_2 {
        private double a;
        private double b;
        private double c;
        public _phuong_trinh_bac_2(){
        }
        public _phuong_trinh_bac_2(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getDiscriminant(){
            return this.b * this.b - 4 * this.a * this.c;
        }
        public double getRoot1(){
            double x1;
            return x1 = ((-this.b + Math.sqrt(getDiscriminant()) / (2 * this.a)));
        }
        public double getRoot2(){
            double x2;
            return x2 = ((-this.b - Math.sqrt(getDiscriminant()) / (2 * this.a)));
        }
        public double getDoubleRoot(){
            double x1,x2;
            return  x1 = x2 =((-this.b) / 2 * this.a);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();
            _phuong_trinh_bac_2 kq = new _phuong_trinh_bac_2(a,b,c);
            if (kq.getDiscriminant()>0 ){
                System.out.println("Phương trình có 2 nghiện phân biệt: " + kq.getRoot1() +" và " + kq.getRoot2());
            }else if (kq.getDiscriminant()==0){
                System.out.println("Phương trình có 1 nghiệm kép: " + kq.getDoubleRoot());
            }else {
                System.out.println("Phương trình vô nghiện");
            }
        }
    }

