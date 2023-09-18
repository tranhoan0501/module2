package _02_loop_in_java.exercise;

public class _so_nguyen_to_duoi_100 {
    public static void main(String[] args) {
        int dem = 1;
        int number = 2;
        while (dem > 0) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                if (number<100){
                    System.out.println(+dem+":" +number);
                    dem++;
                }
            }
            number++;
        }
    }
}
