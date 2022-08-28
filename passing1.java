import java.util.Arrays;

class passing1 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 89 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[3] = 90;
        arr[0] = 78;
    }
}