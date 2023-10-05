
public class Helicopter extends Flayable {
	private int maxspeed;
	private String Type;
	
	public Helicopter(int maxspeed, String type) {
		super();
		this.maxspeed = maxspeed;
		Type = type;
	}
	
	public void FlyDistance() {
		System.out.println("The type of helicopter is " + Type + " and its maximum speed is: " + maxspeed);
		System.out.println("It can fly at a distance of 900ft");
	}
}
