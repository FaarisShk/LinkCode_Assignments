import java.util.*;
public class Test_Compartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compartment compartment[] = new Compartment[10];
		
		for(int i=0;i<10;i++) {
		System.out.println("For which compartment do you want to create a notice \n1)First Class"
				+ "\n2)Ladies \n3)General \n4)Luggage");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			FirstClass f1 = new FirstClass();
			compartment[i] = f1;
			break;
		case 2:
			Ladies l1 = new Ladies();
			compartment[i] = l1;
			break;
		case 3:
			General g1 = new General();
			compartment[i] = g1;
			break;
		case 4:
			Luggage lg1 = new Luggage();
			compartment[i] = lg1;
			}
		}
		
		for(int j=0;j<10;j++) {
			compartment[j].notice();
		}
	}
}
