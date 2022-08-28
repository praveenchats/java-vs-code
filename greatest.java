
//Find Largest no in java Program
import java.util.*;

class greatest {
    public static void main(String args[]) {
        int a, b, c;
        System.out.println("enter any numbers:");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("x is largest no." + a);
        } else if (b > a && b > c) {
            System.out.println("b is largest no." + b);

        } else
            System.out.print("c is largest no." + c);
    }
}
