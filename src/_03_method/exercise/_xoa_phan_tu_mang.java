package _03_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _xoa_phan_tu_mang {
    public static void main(String[] args) {
        int array[]={10,4,6,7,8,6,0,0,0,0};
        System.out.println("Mang ban dau: "+ Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri can xoa");
        int soCanXoa = scanner.nextInt();
        int index=-1;
        for (int i = 0; i<array.length;i++){
            if (array[i]==soCanXoa){
                index=i;
            }
        }
        if (index>=0){
            for (int i = index;i<array.length-1;i++){
                array[i]=array[i+1];
            }
            System.out.println("mang sau khi xoa: "+Arrays.toString(array));
        }else{
            System.out.println("khong thay phan tu de xoa");
        }
    }
}
