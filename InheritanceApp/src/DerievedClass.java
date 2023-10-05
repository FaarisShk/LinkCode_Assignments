
class DerievedClass extends BaseClass{
	protected int x = 20;
	public  void Derieved1() {
		display();
		System.out.println("Display from Derieved");

	}
	protected void show() {
		super.show();
		System.out.println("Showing from Derieved");
		System.out.println("The value of x from base is " + super.x);
		System.out.println("The value of x from derieved class is " + x);
	}
}
