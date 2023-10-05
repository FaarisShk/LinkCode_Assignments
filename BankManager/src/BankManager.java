import java.util.*;
public class BankManager {
	public Account[] createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many accounts you want to create: ");
		int n = sc.nextInt();
		
		Account arr[] = new Account[n];
		
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter Account no, account name, account balance");
		Account ac = new Account(sc.nextInt(),sc.next(),sc.nextDouble());
		arr[i] = ac;
		}
		return arr ; 
	}
	
	public void displayAccount(Account ac[]) {
		for(int i=0;i<ac.length;i++) {
		System.out.println(ac[i].getAccBal()+" "+ac[i].getCustName()+" "+ac[i].getAccNo());
		}
	}
}
