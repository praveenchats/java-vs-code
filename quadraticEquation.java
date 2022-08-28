import java.util.*;

class quadraticEquation {
    public static void main(String args[]) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();
        System.out.println("Enter value of c:");
        c = sc.nextInt();
        d = (b * b) - 4 * a * c;
        if (d < 0) {
            System.out.println("Root is imaginary");
        } else if (d == 0) {
            System.out.println("Roots are equal");
        } else {
            System.out.println("Roots are rational");
        }

    }
}