public class Exception {
	public static void main(String[]args) {
		int a = 10;
		int b = 5;
		int c = 5;
		int x,y;
		
		try {
			System.out.println("Try Block Message");
			x = a/(b-c);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: Don't divide a number by 0");
		}
		System.out.println("I am out of try-catch block");
		
	}
}
