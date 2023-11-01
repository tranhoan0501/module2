package _11_DSA_Stack_Queue_Map.Chuyen_Thap_Phan_Sang_Nhi_Phan;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
    public static String reverseString(String input) {
        Stack<String> wStack = new Stack<>();
        // Tách chuỗi thành các từ bằng khoảng trắng
        String[] mWord = input.split(" ");
        // Đưa từng từ vào Stack
        for (String word : mWord) {
            wStack.push(word);
        }
        // Tạo chuỗi mới để lưu kết quả
        StringBuilder reversedString = new StringBuilder();
        // Lấy các từ từ Stack và nối vào chuỗi mới
        while (!wStack.isEmpty()) {
            reversedString.append(wStack.pop());
            reversedString.append(" "); // Thêm khoảng trắng giữa các từ
        }
        return reversedString.toString().trim(); // Loại bỏ khoảng trắng cuối cùng và trả về chuỗi đã đảo ngược
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
        System.out.println("----------------------");
        String input = "xin chào";
        String reversed = reverseString(input);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
    }
}
