
public class BankMain {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(69,"Faaris",300000,6);
		display(s1);
		
		CurrentAccount c1 = new CurrentAccount(101,"Nayan",532510,"Nagpur Badshah pvt ltd");
		display(c1);
		
	}
	
	public static void display(Account acc) {
		System.out.println("---------------Current Account Details-----------");
		System.out.println("Account Name: " + acc.getCustName());
		System.out.println("Account Id: " + acc.getAccNo());
		System.out.println("Account Balamce: " + acc.getAccBal());
		if (acc instanceof SavingAccount) {
			SavingAccount s1 = (SavingAccount)acc;
			System.out.println("Interest Rate: " + s1.getIntrRate());
		}
		if(acc instanceof CurrentAccount) {
			CurrentAccount c1 = (CurrentAccount)acc;
			System.out.println("Company Name: " + c1.getCompanyName());
		}
	}

}
