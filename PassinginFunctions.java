import java.util.Arrays;

class PassinginFunctions {

    static void change(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int[] num = { 3, 2, 4, 3, 12 };
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
}