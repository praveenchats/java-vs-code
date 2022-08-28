import java.util.*;

class maxVal2 {
    public static void main(String[] args) {
        int[] arr = { 78, 67, 46, 89, 90 };
        System.out.print(Max(arr));

    }

    static int Max(int[] arr) {
        int i;
        int Max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }

        }

        return Max;
    }
}
