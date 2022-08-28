
//swap 2 no without using 3rd variable Program in java
import java.util.*;

public class swapping {
    public static void main(String args[]) {
        int x, y;
        System.out.println("enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before swapping x\n=" + x + "y\n=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("after swapping x\n=" + x + "y\n=" + y);
    }
}