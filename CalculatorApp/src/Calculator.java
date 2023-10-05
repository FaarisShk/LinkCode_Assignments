import java.util.*;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	public void addition() {
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("The addition of num1 and num2 is: " + (num1+num2));
	}
	
	public void subtraction() {
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("The Subtraction of num1 and num2 is: " + (num1-num2));
	}
	
	public void multiplication() {
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("The multiplication of num1 and num2 is: " + (num1*num2));
	}
	
	public void division() {
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("The division of num1 and num2 is: " + (num1/num2));
	}
}
