
public class Address {
	private String State;
	private String  City;
	private int pinC;
	
	public Address(String state, String city, int pinC) {
		super();
		State = state;
		City = city;
		this.pinC = pinC;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPinC() {
		return pinC;
	}

	public void setPinC(int pinC) {
		this.pinC = pinC;
	}
	
	
	
	
	
}
