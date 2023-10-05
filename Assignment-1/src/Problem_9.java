
public class Problem_9 {
	public static void main(String[]args) {
		float A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,5,4,2};
		int i;
		float sum=0;
		float smallest = 0;
		System.out.println("To Calculate Sum");
		for(i=0;i<A.length;i++) {
			sum = sum + A[i];
		} A[15] = sum;
		System.out.println("Sum: " + A[15]);
		System.out.println("To Calculate Average");
		float avg = sum/A.length;
		A[16] = avg;
		System.out.println("Average is: "+ A[16]);
		System.out.println("To Calculate Smallest");
		if (A.length == 0)
		    return;
		float small = A[0];
		int index = 0;
		for (i = 0; i < A.length; i++) {
		    if (A[i] < small) {
		        small = A[i];
		        index = i;
		    }
		}
		A[17] = small;
		System.out.println("Smallest " + A[17]);
		for(i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
}
