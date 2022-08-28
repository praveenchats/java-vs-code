//Input a number and find the sum of all the digits.
import java.util.Scanner;
class sumdigit{
    public static void main(String args[])
    {
        int n,sum=0,x;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number\n:");
        n=sc.nextInt();
        while(n>0)
        {
            x=n%10;
            sum=sum+x;
            n=n/10;

        }
        System.out.println("sum="+sum);

    }
}