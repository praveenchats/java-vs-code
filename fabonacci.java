import java.util.*;

//find the fabonacci series
class fabonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the terms:");
        int n= sc.nextInt();;
        int i=0,j=1, nextterm;
        System.out.println("enter the fabonacci series");
        for(int c = 0;c<n;c++)
        {
            if(c<=1)
            c= nextterm;
            else
            {
                nextterm=i+j;
                i=j;
                j=nextterm;

            }
            System.out.println("enter next term:");
        }
    }
}