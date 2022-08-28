
import java.util.Arrays;

public class GFG {

    public static void main(String[] args) {
        int[] arr = new int[] {arr.length };
        int[] arr_new = new int[arr.length - 1];
        int j = 3;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != j) {
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println(+(arr.length - 1));

    }
}