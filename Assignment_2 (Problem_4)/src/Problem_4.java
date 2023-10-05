import java.util.*;

public class Problem_4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		char op;
		System.out.println("Enter an equation: ");
		n1 = sc.nextInt();op = sc.next().charAt(0); n2 = sc.nextInt(); 
		System.out.println(n1 + " " + op + " " + n2);
		
		switch(op) {
		case '+':
			System.out.println("Result: " + (n1+n2));
			break;
		case '-':
			System.out.println("Result: " + (n1-n2));
			break;
		case '*':
			System.out.println("Result: " + (n1*n2));
			break;
		case '/':
			System.out.println("Result: " + (n1/n2));
			break;
		}
	}
}
