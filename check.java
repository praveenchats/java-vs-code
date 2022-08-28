//WAP to find no. is positive or negative
import java.util.Scanner;
class check{
    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        a=sc.nextInt();
        if(a>0)
        System.out.println("positive="+a);
        else if(a<0)
        System.out.println("negative="+a);
        else
        System.out.println("number is 0");
    }
}