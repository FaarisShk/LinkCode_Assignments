package exp;

interface area{
	final static double pi = 3.14;
	
	public void findarea(double x, double y);
}

class circle implements area{
	public void findarea(double x, double y) {
		double area = pi*x*y;
		System.out.println(area);
	}
}

class rectangle implements area{
	public void findarea(double x, double y) {
		double area = x*y;
		System.out.println(area);
	}
}

public class Interface{
	public static void main(String[]args) {
		circle c1 = new circle();
		c1.findarea(19, 21.9);
		rectangle r1 = new rectangle();
		r1.findarea(13.4, 127.3);
		
		area a1;
		a1 = c1;
		a1.findarea(12.5, 64.22);
	}
}