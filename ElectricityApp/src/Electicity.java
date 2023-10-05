import java.util.*;

public class Electicity {
	Scanner sc =  new Scanner(System.in);
	String custname;
	int custid;
	int units;
	
	public void getcustname() {
		System.out.print("Enter customer name: ");
		custname = sc.next();
	}
	
	public void getcustid() {
		System.out.print("Enter customer id: ");
		custid = sc.nextInt();
	}
	
	public void getunits() {
		System.out.print("Enter units: ");
		units = sc.nextInt();
	}
	
	public void calculate() {
		if (units<100) {
			double total = units*3.33;
			double gst = (total/100)*12;
			double finaltotal = total+gst;
			System.out.println("Charge for units: " + total);
			System.out.println("CGST: " + (gst/2));
			System.out.println("SGST: " + (gst/2));
			System.out.println("Total: " + finaltotal);
		}
		else if(units>100 && units<300) {
			double total1 = (100*3.33);
			double total2 = (units-100)*5.55;
			double total = total1+total2;
			double gst = (total/100)*12;
			double finaltotal = total+gst;
			System.out.println("Charge for units: " + total);
			System.out.println("CGST: " + (gst/2));
			System.out.println("SGST: " + (gst/2));
			System.out.println("Total: " + finaltotal);
		}
		else if(units>300 && units<500) {
			double total1 = (100*3.33);
			double total2 = (200*5.55);
			double total3 = (300-units)*7.77;
			double total = total1+total2+total3;
			double gst = (total/100)*12;
			double finaltotal = total+gst;
			System.out.println("Charge for units: " + total);
			System.out.println("CGST: " + (gst/2));
			System.out.println("SGST: " + (gst/2));
			System.out.println("Total: " + (finaltotal));
		}
		else if(units>500) {
			double total1 = (100*3.33);
			double total2 = (200*5.55);
			double total3 = (200*7.77);
			double total4 = (500-units)*11.11;
			double total = total1+total2+total3+total4;
			double gst = (total/100)*12;
			double finaltotal = total+gst;
			System.out.println("Charge for units: " + total);
			System.out.println("CGST: " + (gst/2));
			System.out.println("SGST: " + (gst/2));
			System.out.println("Total: " + (finaltotal));
			
		}
	}
}
