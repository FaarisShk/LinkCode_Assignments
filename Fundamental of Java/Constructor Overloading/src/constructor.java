class constoverloading{
	int a;
	int b;
	String c;
	
	public constoverloading() {
		a = 10;
		b = 20;
		c = "Faaris";
		System.out.println(a + " " + b + " " + c);
	}
	
	public constoverloading(int x) {
		a = x;
		b = 20;
		c = "Faaris";
		System.out.println(a + " " + b + " " + c);

	}
	public constoverloading(int x, int y) {
		a = x;
		b = y;
		c = "Faaris";
		System.out.println(a + " " + b + " " + c);

	}
	public constoverloading(int x, int y, String z) {
		a = x;
		b = y;
		c = z;
		System.out.println(a + " " + b + " " + c);

	}
}

public class constructor {
	public static void main(String[]args) {
		constoverloading c1 =  new constoverloading();
	}
}