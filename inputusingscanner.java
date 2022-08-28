
//How to get Using input using Scanner Program in java.
import java.util.Scanner;

class inputusingscanner {
    public static void main(String args[]) {
        String s;
        Float f;
        integer i;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        s = in.nextLine();
        System.out.println("you enterd string" + s);

        System.out.println("enter a float");
        f = in.nextFloat();
        System.out.println("you enterd float" + f);

        System.out.println("enter an integer ");
        i = in.nextInt();
        System.out.println("you enterd integer" + i);
    }
}