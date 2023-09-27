package _03_method.exercise;

import java.util.Arrays;

public class _gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        System.out.print("Mang sau khi gop:   ");
        System.out.println(Arrays.toString(result));
    }
}
