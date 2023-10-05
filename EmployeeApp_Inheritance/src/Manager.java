
public class Manager extends Employee {
	private int Bonus;

	public Manager(int empId, String empName, double empSal, int bonus) {
		super(empId, empName, empSal);
		Bonus = bonus;
	}

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	
	
	
}
