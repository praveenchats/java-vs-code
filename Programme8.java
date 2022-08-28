// change the temperature 
import java.util.Scanner;

class Programme8 {
    public static void main(String[] args) {

        float f, c;
        System.out.println("Enter an Input:");
        Scanner in = new Scanner(System.in);
        f = in.nextFloat();
        c = ((5.0f / 9.0f) * (f - 32.0f));
        System.out.println("celsius:" + c);
    }
}