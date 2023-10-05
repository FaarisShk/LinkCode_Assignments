import java.util.*;
public class Number {
	private int firstNumber;
	private int secondNumber;
	private double result;
	
	public Number(int firstNumber, int secondNumber) {
		super();
		try {
			if(secondNumber == 0) {
				throw new ArithmeticException();
			}
			else {
				this.firstNumber = firstNumber;
				this.secondNumber = secondNumber;
			}
		} catch(ArithmeticException a1) {
			System.out.println(a1);
		}
	}
	
	public void add() {
		result = firstNumber + secondNumber;
		System.out.println(result);
	}
	
	public void sub() {
		result = firstNumber - secondNumber;
		System.out.println(result);
	}
	
	public void mul() {
		result = firstNumber * secondNumber;
		System.out.println(result);
	}
	
	public void div() {
		result = firstNumber / secondNumber;
		System.out.println(result);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0,num2 = 0,cont;
		do {
			try {
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		Number n1 = new Number(num1,num2);
		
		System.out.println("Select the operation you want to perform: \n1)Addition \n2)Subtraction "
				+ "\n3)Multiplication \n4)Division");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			n1.add();
			break;
		case 2:
			n1.sub();
			break;
		case 3:
			n1.mul();
			break;
		case 4:
			n1.div();
			break;
		}
		System.out.println("Press 1 to continue.....");
		cont = sc.nextInt();
	  } while(cont==1);
	}
}
