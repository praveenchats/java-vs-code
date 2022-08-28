
//addition of 2 numbers by taking input by method.
import java.util.*;

public class sum5 {

    static int mysum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers:");

        x = sc.nextInt();
        y = sc.nextInt();
        sum = mysum(x, y);
        System.out.println("the sum of two no. is: " + sum);

    }
}