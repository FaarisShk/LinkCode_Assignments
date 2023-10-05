import java.util.*;
public class area {
	
	Scanner sc = new Scanner(System.in);
	public void triangle() {
		System.out.print("Enter breadth: ");
		Float b = sc.nextFloat();
		System.out.print("Enter height: ");
		Float h = sc.nextFloat();
		float ta = 0.5f*b*h;
		System.out.println("The area of the traingle is: " + ta);
	}
	
	public void circle() {
		System.out.print("Enter radius: ");
		Float r = sc.nextFloat();
		Float ca = 3.14f*r*r;
		System.out.println("The area of circle is: " + ca);
	}
	
	public void rectangle() {
		System.out.print("Enter length: ");
		Float l = sc.nextFloat();
		System.out.print("Enter breadth: ");
		Float b = sc.nextFloat();	
		Float ra = l*b;
		System.out.println("The area of the rectangle is: " + ra);
	}
}
