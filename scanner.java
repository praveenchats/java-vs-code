// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class scanner {
	public static void main(String args[])
	{
		// Using Scanner for Getting Input from User
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println("You entered string " + s);

		int a = sc.nextInt();
		System.out.println("You entered integer " + a);

		float b = sc.nextFloat();
		System.out.println("You entered float " + b);
	}
}
