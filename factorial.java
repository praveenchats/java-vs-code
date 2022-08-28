
// find factorial of a no.
import java.util.*;

class factorial {
    public static void main(String[] args) {
        int n, c, fact = 1;

        System.out.println("enter any no.to check factorial:");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        if (n <= 0) {
            System.out.println("no. should be non negative");
        } else {
            for (c = 1; c <= n; c++)
                fact = fact * c;
            System.out.println("Factorial of " + n + " is = " + fact);
        }

    }
}