//wap to check no. is even or odd
import java.util.Scanner;
class oddeven
{
    public static void main(String args[])
    {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number:");
        a=sc.nextInt();
        if(a%2==0)
        System.out.println("even number="+a);
        else
        System.out.println("odd number");
    }
}