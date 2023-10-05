import java.util.*;
public class Problem_8 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int myarr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
		System.out.println("Enter the numbers to search in array: ");
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]==n) {
				flag =+ 1;
				break;
			} else 
				flag = 0;
			
		} 
		
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]==n2) {
				flag = +1;
				break;
			}else 
				flag = 0;
			
		} 
		System.out.println(flag);
		if(flag==2) {
			System.out.println("--------BINGO---------:)");
		} else {
			System.out.println("--------NOT BINGO-----:(");
		}
	}
}
