import java.util.*;

public class intsort{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();
		
		//taking array input from user
		int [] myarr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter integer at " + i);
			myarr[i] = sc.nextInt();
		}
		
		/*displaying the array
		for (int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		} */
		
		//sorting the array
		for(int i=0;i<myarr.length;i++) {
			for (int j=i+1;j<myarr.length;j++) {
				if(myarr[i]>myarr[j]) {
					int temp = myarr[i];
					myarr[i] = myarr[j];
					myarr[j] = temp;
				}
			}
			
		}
		for(int i =0; i<myarr.length;i++) {
			System.out.println("Sorted Array elements are" + myarr[i]);
		}
	}
}


