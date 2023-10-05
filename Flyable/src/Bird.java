
public class Bird extends Flayable{
	private int age;
	private float weight;
	
	public Bird(int age, float weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	
	public void FlyDistance() {
		System.out.println("The age of the bird is " + age + " and its weight is: " + weight);
		System.out.println("The Bird can fly at a distance of 500ft");
	}
}
