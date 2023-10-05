import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Enter
		Employee e1 = Create();
		Display(e1);
	}
		
		public static Employee Create() {
			int arr[] = new arr[n];
			for(int i=0;i<=)
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Employee ID: ");
			int empId = sc.nextInt();
				
			System.out.println("Enter Employee Name: ");
			String empName = sc.next();
				
			System.out.println("Enter Employee Salary: ");
			double empSal = sc.nextDouble();
			
			Employee e1 = new Employee(empId,empName,empSal);
			
			return e1;
		}
		
		public static void Display(Employee e1) {
			System.out.println("-----Employee Details-----");
			System.out.println("Employee Id: "+ e1.getEmpId());
			System.out.println("Employee Name: " + e1.getEmpName());
			System.out.println("Employee Salary: " + e1.getEmpSal());
		}
		
	}

