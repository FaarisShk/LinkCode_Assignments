import java.util.*;
public class BankMainApp {
	public static void display(int accno, String cname, double accBal, int age) throws Exception {
		try {
			if(accBal < 1000) {
				throw new InvalidBalException();
			}
			System.out.println("Welcome ...... Account is now active");
		} catch (InvalidBalException e1) {
			System.out.println(e1);
			throw e1;
		}
		
		try {
			if(age < 18) {
				throw new InvalidAgeException();
			}
		} catch (InvalidAgeException a1) {
			System.out.println(a1);
			throw a1;
		}
	}
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter acc. no: ");
		int accno = sc.nextInt();
		
		System.out.println("Enter Customer Bal: ");
		int accBal = sc.nextInt();
		
		System.out.println("Enter Account Holder's Name: ");
		String cname = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		try {
			display(accno,cname,accBal,age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you for banking with us");
	} 
}
