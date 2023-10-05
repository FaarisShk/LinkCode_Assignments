
public class NewEmployee {
	public static void main() {
		Employee e1 = create();
		display(e1);
	}
	
	public static Employee create() {
		Employee e1 = new Employee(101,"Faaris",45.36);
		return e1;
	}
	public static void display(Employee e1) {
		System.out.println("Employee ID: "+ e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Employee Salary in Lakhs: " + e1.getEmpSal());
	}
}
