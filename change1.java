import java.util.*;

class change1 {
    public static void main(String[] args) {
        int[] nums = { 88, 63, 65, 86, 93 };
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.print(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}