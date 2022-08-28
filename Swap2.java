import java.util.Arrays;

class Swap2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        swap1(arr, 0, 4);
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap1(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap1(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}