import java.util.List;
import java.util.*;

public class BankMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		bankInfo binfo = new bankInfo();
		List<Account> lstacc = binfo.create();
		System.out.println("1)Create " + "\n" + "2)Search" + "\n" + "3)Delete" + "\n" + "4)Display");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			binfo.create();
			break;
		case 2:
			binfo.searchAccount(lstacc, ch);
			break;
		case 3:
			binfo.deleteAccount(lstacc, ch);
			break;
		case 4:
			binfo.display(lstacc);
			break;
		}
	}
}
