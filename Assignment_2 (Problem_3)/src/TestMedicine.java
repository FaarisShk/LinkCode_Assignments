import java.util.*;
public class TestMedicine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Medicine medicine[] = new Medicine[10];
		for(int i=0;i<10;i++) {
			System.out.println("Which Medicine are you looking for \n1)Tablet \n2)Ointment \n3)Syrup");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				Tablet t1 = new Tablet();
				medicine[i] = t1;
				break;
			case 2:
				Ointment o1 = new Ointment();
				medicine[i] = o1;
				break;
			case 3:
				Syrup s1 = new Syrup();
				medicine[i] = s1;
				break;
			}
		}
		
		for(int j=0;j<10;j++) {
			medicine[j].displayLabel();
		}
	}

}
