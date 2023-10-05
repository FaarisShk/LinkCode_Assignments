/*1.Write a program to list all even numbers less than or equal to the number n. Take the value 
of n as input from user. */
import java.util.*;

public class Problem_1 {
	Scanner sc = new Scanner(System.in);
	
	public void Even_Check(){
	int i;
	System.out.print("Enter N: ");
	int n = sc.nextInt();
	for(i=0;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i + " is an even number");
			}
		}
	}
}
