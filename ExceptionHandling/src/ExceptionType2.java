
public class ExceptionType2 {
	public static void average(int n) {
		try {
		int i,j = 0;
		int k = n;
		for (i=0;i<=k;i++) {
			j = j+ i;
		}
		
		System.out.println("Average is : " + j/n);
		} catch (IllegalArgumentException n1){
			System.out.println("Exception: " + n1);
		} finally {
			
		}
	}
	
	public static void main(String[]args) {
		average(213);
	}
}
