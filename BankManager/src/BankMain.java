
public class BankMain {

	public static void main(String[] args) {
		BankManager bm = new BankManager();
		Account ac[] = bm.createAccount();
		bm.displayAccount(ac);
	}

}
