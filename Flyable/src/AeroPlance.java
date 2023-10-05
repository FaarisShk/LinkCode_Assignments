
public class AeroPlance extends Flayable{
	private String Brand;
	private int Capacity;
	
	public AeroPlance(String brand, int capacity) {
		super();
		Brand = brand;
		Capacity = capacity;
	}
	
	public void FlyDistance() {
		System.out.println("It is a " + Brand + " plane and can its capacity is " + Capacity);
		System.out.println("The Plane can fly at a distanc eof 1200ft");
	}
	
}
