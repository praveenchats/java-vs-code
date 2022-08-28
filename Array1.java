
//array
import java.util.*;

class Array1 {
    public static void main(String[] args) {
        int i;

        Scanner in = new Scanner(System.in);
        // array of primitives.
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 33;
        arr[2] = 890;
        arr[3] = 66;
        arr[4] = 90;

        System.out.println(arr[3]);
        // for (i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();

        // }
        // for (i = 0; i < arr.length; i++) {

        // }
        // {
        // System.out.print(Arrays.toString(arr));

        // }
        // array of objects./**

        String[] str = new String[5];
        for (i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.print(Arrays.toString(str));
        // modify

        str[1] = "praveen";
        System.out.println(Arrays.toString(str));

    }
}