import java.util.*;
public class Instrument_Main {

	public static void main(String[] args) {
		Instrument myarr[] = new Instrument[10];

		Scanner sc = new Scanner(System.in);
		
	
			for(int i=0;i<10;i++) {
				System.out.println("1)Piano \n2)Guitar \n3)Flute \nSelect which object you want to create");
				int n = sc.nextInt();
				switch(n) {
					case 1:
						Piano p1 = new Piano();
						myarr[i] = p1;
						break;
					case 2:
						Guitar g1 = new Guitar();
						myarr[i] = g1;
						break;
					case 3:
						Flute f1 = new Flute();
						myarr[i] = f1;
						break;
				}
			} 
			for(int j=0;j<10;j++) {
				myarr[j].play();
			}
			System.out.println("--------Instanceof-------");
			for(int i=0;i<10;i++) {
			if (myarr[i] instanceof Guitar) {
				System.out.println("Object at index " + i + " is an instance of Guitar");
			} else if(myarr[i] instanceof Flute) {
				System.out.println("Object at index " + i + " is an instance of Flute");
			} else if(myarr[i] instanceof Piano) {
				System.out.println("Object at index " + i + " is an instance of Piano");
			}
		}
	}	
}
