import java.util.*;

class passingvalues {

    static void changes(int[] arr) {
        arr[2] = 89;
    }

    public static void main(String[] args) {
        int[] num = { 1, 4, 56, 5, 7 };
        System.out.println(Arrays.toString(num));
        changes(num);
        System.out.print(Arrays.toString(num));

    }
}