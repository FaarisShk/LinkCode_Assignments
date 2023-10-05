import java.util.Scanner;

public class Class_This_ptr {
	
		Scanner sc = new Scanner(System.in);
		public void addition(int num1, int num2) {
			int n1 = num1;
			int n2 = num2;
			System.out.println("The addition of num1 and num2 is: " + (n1+n2));
		}
		
		public void subtraction(int num1, int num2) {
			int n1 = num1;
			int n2 = num2;
			System.out.println("The Subtraction of num1 and num2 is: " + (n1-n2));
		}
		
		public void multiplication(int num1, int num2) {
			int n1 = num1;
			int n2 = num2;
			System.out.println("The multiplication of num1 and num2 is: " + (n1*n2));
		}
		
		public void division(int num1, int num2) {
			int n1 = num1;
			int n2 = num2;
			System.out.println("The division of num1 and num2 is: " + (n1/n2));
		}
	}
