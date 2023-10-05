import java.util.*;
public class Problem_2_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem_2 p2 = new Problem_2();
		System.out.println("How many area's do you want to calcuate: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		p2.getpara();
		p2.calculate();
		p2.display();
		} 
	}

}
