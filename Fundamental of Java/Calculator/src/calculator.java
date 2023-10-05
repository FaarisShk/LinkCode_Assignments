import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1,input2,choice;
		System.out.print("Enter first number: ");
		input1 = sc.nextInt();
		System.out.print("Enter second number: ");
		input2 = sc.nextInt();
		System.out.println("Operations available: \n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division \n5)Modulus");
		System.out.print("Enter your choice of operation: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("The addition of your two numbers is: " + (input1+input2));
			break;
		case 2:
			System.out.println("The subtraction of your two numbers is: " + (input1 - input2));
			break;
		case 3:
			System.out.println("The multiplication of your two numbers is: " + (input1 * input2));
			break;
		case 4:
			System.out.println("The division of your two numbers is: " + (input1/input2));
			break;
		case 5:
			System.out.println("The modulus division of your two numbers is: " + (input1%input2));
			break;
		}
	}

}
