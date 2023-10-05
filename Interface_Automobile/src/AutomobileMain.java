import java.util.*;
public class AutomobileMain {
	public static void main (String[]args) {
		Scanner sc =  new Scanner(System.in);
		int ch = 0;
		Automobile a1 = null;
		int str = 0;
		do {
			System.out.println("---------SHOWROOM----------");
			System.out.println("1)Cars \n2)Bike");
			System.out.println("Enter your choice: ");
			int ch2 = sc.nextInt();
			switch(ch2) {
			case 1:
				do {
					System.out.println("---------CARS----------");
					System.out.println("1)Maruti \n2)BMW \n3)Lamboghini");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch) {
					case 1:
						a1 = new Maruti();
						display(a1,"Maruti");
						break;
					case 2:
						a1 = new BMW();
						display(a1,"BMW");
						break;
					case 3:
						a1 = new Lamborghini();
						display(a1,"Lamborghini");
						break;
					}
				}while(str!=0);
				System.out.println("TY");
				break;
			case 2: 
				do {
					System.out.println("---------BIKES----------");
					System.out.println("1)Hero \n2)Honda");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();
					switch(ch) {
					case 1:
						a1 = new Hero();
						display(a1,"Hero");
						break;
					case 2:
						a1 = new Honda();
						display(a1,"Honda");
						break;
					}
				}while(str!=0);
			} 
			System.out.println("Do you want to continue: ");
			str = sc.nextInt();
		} while(str!=0);		
	}

	public static void display(Automobile a, String str) {
		System.out.println(str + "Model: " + a.getModel());
		System.out.println(str + "Color: " + a.getColor());
		System.out.println(str + "Cost: " + a.getPrice());
	}
}



/*
One Interface can extend another interface Interface bike extends automobile Class Hero Honda 
implements automobile, bike or class Hero Honda implements bike. In both the scenario, Hero 
Honda class has to override all the methods from both the interface.

Object class is the base class of all the classes in Java. There are five methods in object class
1st -  Two String
2nd -  Equals Method

Two String method is used to print object in the form of a string 
Equals Method is used to check equality of the two objects on the basis of real contents
 */