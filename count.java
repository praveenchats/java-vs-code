/*In the above program count and print those digits from the result number which are also present in the original 
number*/
import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        int n,sum=0,x;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number\n:");
        n=sc.nextInt();
        while(n>0)
        {
            x=n%10;
            System.out.println("x="+x);
            sum=sum+x;
            System.out.println("sum="+sum);
            n=n/10;
            System.out.println("n="+n);

        }
        System.out.println("sum="+sum);
    }
}

