import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bankInfo {
	public List<Account> create(){
		String str = null;
		Scanner sc = new Scanner(System.in);
		List<Account> lstacc = new ArrayList<Account>();
		do {
			System.out.println("Enter Account no: ");
			int accNo = sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String custName = sc.next();
			System.out.println("Enter Account Bal: ");
			double accBal = sc.nextDouble();

			Account accobj = new Account(accNo,custName,accBal);
			lstacc.add(accobj);
			System.out.println("Do you want to add next object yes/no");
			str = sc.next();
		} while(str.equals("yes"));
		return lstacc;
	}

	public void display(List<Account>lstacc) {
		for (Account a:lstacc) {
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}
	
	public Account searchAccount(List<Account> lstacc, int accNo) {
		Account tempacc = null;
		for(Account a:lstacc) {
			if(a.getAccNo()==accNo){
				tempacc = a;
				break;
			}
		}
		return tempacc;
	}
	
	public void deleteAccount(List<Account> lstacc, int accNo) {
		Account tempacc = null;
		tempacc = searchAccount(lstacc,accNo);
		if(tempacc!=null) {
			lstacc.remove(tempacc);
			System.out.println("Account Deleted");
		}
	}
}
