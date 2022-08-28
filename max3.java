//max between 3 numbers
import java.util.Scanner;
class max3
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        System.out.println("enter third number:");
        c=sc.nextInt();
        if(a>b&&a>c)
        System.out.println("max number="+a);
        else if(b>a&&b>c)
        System.out.println("max number="+b);
        else
        System.out.println("max number="+c);
    }
}