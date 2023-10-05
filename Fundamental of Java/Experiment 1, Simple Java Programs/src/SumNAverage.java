import java.util.*;

public class SumNAverage{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int i,n,arr=0,sum =0,average;
		System.out.println("Enter N: ");
		n = sc.nextInt();
		
		for (i=0;i<+n;i++) {
			System.out.println("Enter Number " + i);
			arr = sc.nextInt();
			sum = sum + arr;
		}
		System.out.println(arr);
		average = sum/n;
		System.out.println("Sum of " + n + " numbers is:" + sum);
		System.out.println("Average of " + n + " numbers is: " + average);
		
	}
}