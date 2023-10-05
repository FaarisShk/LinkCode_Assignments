
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		/*c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division(); */
		
		//With parametrized method
		Class_This_ptr c2 = new Class_This_ptr();
		c2.addition(10, 20);
		c2.subtraction(100, 80);
		c2.multiplication(10, 10);
		c2.division(100, 20);
	}

}
