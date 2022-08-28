
//WAP to observe the diffrence between - and ~ operators 
import java.util.*;

class Programme11 {
    public static void main(String[] args) {

        int a, b, d;
        System.out.println("enter an output:");

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        d = a + b;
        System.out.println(-d);
        System.out.println(~d);

    }
}