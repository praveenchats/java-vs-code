import java.util.*;

class Odd99 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        try (Scanner in = new Scanner(System.in)) {
            int n;
            n = in.nextInt();

            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n % 2 == 0)
                    if (n >= 2 && n <= 5) {
                        System.out.println("Not Weird");
                    } else if (n >= 6 && n <= 20) {
                        System.out.println("Weird");
                    } else
                        System.out.println("Not Weird");
            }
        }
    }
}