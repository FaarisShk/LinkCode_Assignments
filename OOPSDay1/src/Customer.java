
public class Customer {
	private int custId;
	private String Custname;
	private int Mobno;
	private Address addr;
	private Product prod;
	
	public Customer(int custId, String custname, int mobno, Address addr, Product prod) {
		super();
		this.custId = custId;
		Custname = custname;
		Mobno = mobno;
		this.addr = addr;
		this.prod = prod;
	
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustname() {
		return Custname;
	}

	public void setCustname(String custname) {
		Custname = custname;
	}

	public int getMobno() {
		return Mobno;
	}

	public void setMobno(int mobno) {
		Mobno = mobno;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

}

	