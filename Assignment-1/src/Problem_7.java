import java.util.*;
public class Problem_7 {
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		int i,n1,n2,n3,temp=0;
		System.out.println("Enter two numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for(i=0;i<8;i++) {
		System.out.println(n1);
		System.out.println(n2);
		n3 = n1 + n2;
		temp = n2 + n3;
		n1 = n3;
		n2 = temp;
		}
	}
}
