import java.util.*;
public class FlyableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flayable f = null;
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1)Bird \n2)Aeroplane \n3)Helicopter");
		System.out.println("Enter you choice: ");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			f = new Bird(1,1.2f);
			
		}
		
	}

}
