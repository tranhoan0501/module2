package _02_loop_in_java.exercise;

public class _20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int dem = 1;
        int number = 2;
        while (dem < 21) {
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
                System.out.println(+dem+":" +number);
                dem++;
            }
            number++;
        }
    }
}
