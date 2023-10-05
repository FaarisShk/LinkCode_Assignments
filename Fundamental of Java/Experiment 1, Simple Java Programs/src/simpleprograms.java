import java.util.*;

public class simpleprograms{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i,n,fact=1;
		
		System.out.println("Enter N: ");
		n = sc.nextInt();
		
		for(i=1;i<+n;i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial is" + fact);
	}
}