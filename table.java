import java.util.Scanner;

class table{
    public static void main(String args[]){
        int n,i=0,mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("print any number");
        n=sc.nextInt();
        while(i<=10)
        {
            mul = i*n;
            System.out.println(n + "*" +i + "=" + mul);
            i++;
        }
    }
}