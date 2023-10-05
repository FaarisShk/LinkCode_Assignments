
public class Circle extends Shape{
	private float r;
	public Circle(float r) {
		this.r = r;
	}
	
	@Override
	public void findArea() {
		float ca = 3.14f*r*r;
		System.out.println("Area of Cirlce: " + ca);
	}
}
