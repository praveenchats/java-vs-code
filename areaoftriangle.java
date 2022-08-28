//area of triangle
import java.util.Scanner;
class areaoftriangle{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the width of triangle:");
        double b= s.nextDouble();
        System.out.println("enter the height of triangle:");
        double h= s.nextDouble();
        double area=(b * h)/2;
        System.out.println("area of triangle is: "+area);
        
    }
}