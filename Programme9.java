// wap to find the smaller and greater number among two numbers using ternory operator

import java.util.*;

class Programme9 {

    public static void main(String[] args) {

        int a, b, g, s;

        System.out.println("Enter any number:");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

        g = a > b ? a : b;
        System.out.println("Greater:" + g);

        s = a < b ? a : b;
        System.out.println("Smaller:" + s);
    }
}