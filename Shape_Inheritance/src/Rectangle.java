
public class Rectangle {
	private float l;
	private float b;
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void findArea() {
		float ra = l*b;
		System.out.println("The area of rectangle is: " + ra);
	}
}
