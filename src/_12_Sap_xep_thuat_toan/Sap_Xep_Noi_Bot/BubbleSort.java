package _12_Sap_xep_thuat_toan.Sap_Xep_Noi_Bot;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    // codes below here
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        System.out.print("Mang sau sap xep: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

