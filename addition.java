
//add two number Program in java
import java.util.*;

public class addition {
    public static void main(String args[]) {
        int x, y, sum;
        System.out.println("enter any two no.:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        sum = x + y;

        System.out.println("sum of x and y is\n" + sum);
    }

}