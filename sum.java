import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i,add=0;
        System.out.println("enter value of N:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            add = add+i;
            i=i+1;
        }
        System.out.println("addition="+add);
    }
}