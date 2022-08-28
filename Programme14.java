
// swapping of two numbers
import java.util.*;

class Programme14 {
    public static void main(String[] args) {

        int x, y, temp;
        System.out.println("enter an input: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("before swap:" + x);
        System.out.println("before swap:" + y);
        temp = x;
        x = y;
        y = temp;

        System.out.println("after swap:" + x);
        System.out.println("after swap:" + y);

    }
}