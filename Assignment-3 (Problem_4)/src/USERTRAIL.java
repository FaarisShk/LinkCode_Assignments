import java.util.*;
public class USERTRAIL {
	private int val1;
	private int val2;


	public USERTRAIL(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}


	public void show() throws Exception{
		try{
			if(val1<0 || val2<0) {
				throw new IllegalValueException();
			} else {
				System.out.println("Values are greater than 0");
			}
		} catch (IllegalValueException e1) {
			System.out.println(e1);
			throw e1;
		}
	}
	
	public static void main(String[]args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter num2: ");
		int n2 = sc.nextInt();
		
		USERTRAIL u1 = new USERTRAIL(n1,n2);
		u1.show();
	}
}
