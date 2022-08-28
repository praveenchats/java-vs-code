import java.util.*;

class Max7 {
    public static void main(String[] args) {

        int[] arr = { 23, 67, 98, 77, 65, 36 };
        max(arr);
        System.out.print(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}