
public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	public void withdraw(float amt) throws Exception{
		try {
			balance -= amt;
			System.out.println("Update balance is: " + balance);
			
			if(accType == "Savings"&& balance<1000) {
				throw new LowBalanceException();
			}
			else if(accType == "Current" && balance<5000) {
				throw new LowBalanceException();
			}   
		}catch(LowBalanceException L1) {
			System.out.println(L1);
			throw L1;
		}
	}

	public void deposit(float amt) throws Exception{
		try{
			if(amt < 0) {
				throw new NegativeAmount();
			} 
			else {
				balance += amt;
				System.out.println("Update balance is: " + balance);
			}
		} catch(NegativeAmount n2) {
			System.out.println(n2);
			throw n2;
		}

	}

	void getBalance() throws LowBalanceException {
		try{
			if(accType == "Savings"&& balance<1000) {
				throw new LowBalanceException();
			}
			else if(accType == "Current" && balance<5000) {
				throw new LowBalanceException();
			}   
		} catch(LowBalanceException e1) {
			System.out.println(e1);
			throw e1;
		}
	}

	public static void main (String[]args) {
		BankAccount b1 = new BankAccount(101,"Faaris","Savings",51310);
		BankAccount b2 = new BankAccount(102,"Darri","Current",142141);
		try {
			b1.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b1.withdraw(21000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b2.withdraw(140000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b2.deposit(-1212);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b1.getBalance();
		} catch (LowBalanceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			b2.getBalance();
		} catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
