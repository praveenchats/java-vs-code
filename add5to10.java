//Use recursion to add all of the numbers between 5 to 10.
public class add5to10 {

    static int sum1(int start, int end) {
        if (end > start) {
            return end + sum1(start, end - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum1(5, 10);
        System.out.println(result);

    }
}