import java.util.*;

//find the fabonacci series
class fabonacci1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.innext,c;
        System.out.println("enter the terms:");
        int i=0,j=1, nextterm;
        System.out.println("enter the fabonacci series");
        for(c=0;c<n;c++)
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