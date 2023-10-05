import java.util.*;

public class ExceptionType1 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:  ");
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.println("Hello");
			int result = n1/n2;
			System.out.println("Ans is " + result);
		} 
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Exception is: " +ex);
		}
		
		finally {
			System.out.println("This block will print in any condition");
		}
		System.out.println("------------Thank You-----------");
	}
}
