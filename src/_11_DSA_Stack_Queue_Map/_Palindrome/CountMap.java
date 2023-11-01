package _11_DSA_Stack_Queue_Map._Palindrome;

import java.util.Scanner;
import java.util.TreeMap;

public class CountMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();
        TreeMap<String,Integer> countmap = new TreeMap<>();
        // Tách chuỗi thành các từ và duyệt qua từng từ
        String [] words = input.split("");
        for (String word : words){
            word = word.toLowerCase();
            if (countmap.containsKey(word)){
                int count = countmap.get(word);
                countmap.put(word, count + 1);

            }else
                countmap.put(word,1);
        }
        countmap.remove(" ");// xoá khoảng cách
        for (String word : countmap.keySet()){
            int count = countmap.get(word);
            System.out.println(word + ":" + count);
        }
    }
}
