
public class Employee {
	private int empId;
	private String empName;
	private String Designation;
	private double basic;
	private static double Hra;

	public Employee(int empId, String empName, String designation, double basic) throws LowSalException {
		super();
		try {
			if(basic<500) {
				throw new LowSalException();
			} else {
				this.empId = empId;
				this.empName = empName;
				Designation = designation;
				this.basic = basic;
			}
		} catch (LowSalException Ls1) {
			System.out.println(Ls1);
			throw Ls1;
		}	
	}

	public static void printDET(Employee e1) {
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.Designation);
		System.out.println(e1.basic);
	}

	public void calulateHRA() {
		if(Designation == "Manager") {
			Hra = (basic*0.1);
			System.out.println(Hra);
		} else if(Designation == "Officer") {
			Hra = (basic*0.12);
			System.out.println(Hra);
		} else if(Designation == "Clerk") {
			Hra = (basic*0.05);
			System.out.println(Hra);
		}
	}
	
	public static void main(String[]args) throws Exception{
		Employee e1 = new Employee(101,"Faaris","Manager",35000);
		Employee e2 = new Employee(102,"Darri","Officer",40000);
		Employee e3 = new Employee(103,"Namjun","Clerk",20000);
		printDET(e1);
		printDET(e2);
		printDET(e3);
		e1.calulateHRA();
		e2.calulateHRA();
		e3.calulateHRA();
		
	}

}
