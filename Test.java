import java.util.*;

public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int num : arr) {
        // System.out.println(num + " ");
        // }
        // System.out.println(Arrays.toString(arr));

        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

    }
}