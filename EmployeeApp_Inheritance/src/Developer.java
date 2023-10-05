
public class Developer extends Employee{
	private int Hours;

	public Developer(int empId, String empName, double empSal, int hours) {
		super(empId, empName, empSal);
		Hours = hours;
	}

	public int getHours() {
		return Hours;
	}

	public void setHours(int hours) {
		Hours = hours;
	}
	
	
}
