
public class CurrentAccount extends Account {
	private String companyName;

	public CurrentAccount(int accNo, String custName, double accBal, String companyName) {
		super(accNo, custName, accBal);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
