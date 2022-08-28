import java.util.Arrays;
class array10 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 89 };
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[3] = 90;
    }
}