
public class EmployeeMain {

	public static void main(String[] args) {
		Manager mobj = new Manager(69,"Faaris",65000,5000);
		System.out.println("Manager Id: " + mobj.getEmpId());
		System.out.println("Manager Name: " + mobj.getEmpName());
		System.out.println("Manager Salary: " + mobj.getEmpSal());
		System.out.println("Manager Bonus: " + mobj.getBonus());
		
		Developer d1 = new Developer(68,"Nayan",70000,127);
		System.out.println("Developer Id: " + d1.getEmpId());
		System.out.println("Developer Name: " + d1.getEmpName() );
		System.out.println("Developer Salary: " + d1.getEmpSal());
		System.out.println("Developer Bonus: " + d1.getHours());
	}

}
