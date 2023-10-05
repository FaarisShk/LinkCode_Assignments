import java.util.*;
public class CalcAverage {
	public static double avgFirstN(int N) {

		try {
			if(N<0) {
				throw new IllegalArgumentException();
			}
			else {
				int sum=0,avg;
				for(int i =0;i<N;i++) {
					sum = sum + i;
				}
				System.out.println("Average is: " + (sum/N));
			}
		} catch (IllegalArgumentException e1) {
			System.out.println(e1);
		}
		
		return 0;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number: ");
		int N = sc.nextInt();
		
		avgFirstN(N);
	}
}
