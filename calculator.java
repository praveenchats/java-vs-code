//simple calculator programme
import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        System.out.println("enter your choice 1->add: 2->subtract: 3->multiply: 4->division:\n enter your choice");
        ch=sc.nextInt();
        if(ch==1)
        System.out.println("addition="+(a+b));
        else if(ch==2)
        System.out.println("subtration="+(a-b));
        else if(ch==3)
        System.out.println("multiplication="+(a*b));
        else if(ch==4)
        System.out.println("division="+(a/b));
        else
        System.out.println("invalid choice");
        }
}