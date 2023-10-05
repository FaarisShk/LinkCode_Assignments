
public class SavingAccount extends Account {
	private int intrRate;

	public SavingAccount(int accNo, String custName, double accBal, int intrRate) {
		super(accNo, custName, accBal);
		this.intrRate = intrRate;
	}

	public int getIntrRate() {
		return intrRate;
	}

	public void setIntrRate(int intrRate) {
		this.intrRate = intrRate;
	}
	
}
