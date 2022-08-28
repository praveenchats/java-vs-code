//area of circle
import java.util.Scanner;
class areaofcircle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("enter radius of circle:");
        double r= s.nextDouble();
        double area=(3.14*r*r);
        System.out.println("area of circle: "+ area);

    }
}