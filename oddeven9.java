import java.util.*;

class oddeven9 {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter any number:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if (num % 2 == 0)

            System.out.println("even");
        else
            System.out.println("odd");

    }
}