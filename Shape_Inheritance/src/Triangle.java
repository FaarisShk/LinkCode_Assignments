
public class Triangle {
	private float base;
	private float height;
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void findarea() {
		float ta = 0.5f*base*height;
		System.out.println("The area of a traingle is: " + ta);
	}
}
