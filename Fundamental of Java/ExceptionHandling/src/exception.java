public class exception{
	public static void main (String[]args) {
		int a = 10;
		int b = 10;
		int c = 10;
		
		try {
			int z = c/(a-b);
		}
		
		catch(ArithmeticException z) {
			System.out.println("Donot divide by 0");
		}
		
		System.out.println("This is outside Catch block");
	}
}