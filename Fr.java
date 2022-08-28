
//How to convert Fahrenheit to Celsius Program in java.
import java.util.*;

class Fr {
    public static void main(String args[]) {
        float temperature;
        Scanner in = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        temperature = in.nextInt();

        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("Temperature in celsius is = " + temperature);

    }

}