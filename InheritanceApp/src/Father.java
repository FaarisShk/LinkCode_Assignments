
public class Father extends Gradfather{
	
	private int fage;
	public Father(int fage) {
		super(fage+30);
		this.fage = fage;
	}
	public void showAge() {
		super.ShowAge();
		System.out.println("Father Age is: " + fage);
	}
}

