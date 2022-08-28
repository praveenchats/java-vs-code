import java.io.*;
class add
{
    public static void main(String[] args) throws IOException
    {
        int a,b,c,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number:");
        a=Integer.parseInt(br.readLine());
        System.out.println("enter second number:");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("addition= "+c);
    }
}