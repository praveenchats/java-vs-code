
// WAP to check no. is even or odd by method 
import java.util.*;

public class oddeven1 {

    static void mycheck(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("odd");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("put any no. to check even or odd:");
        int num = sc.nextInt();
        mycheck(num);

    }
}