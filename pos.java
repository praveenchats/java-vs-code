// no. is positive or negative
import java.util.*;
class pos {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");

        num = in.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("negative");
        }
    }
}