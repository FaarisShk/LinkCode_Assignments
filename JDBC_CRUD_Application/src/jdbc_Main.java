import java.util.*;

import com.student.manage.StudentDao;
import com.student.manage.StudentInfo;

public class jdbc_Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Student Management App");
		
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to UPDATE Student");
			System.out.println("Press 5 to SEARCH Student");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Student ID: ");
				int id = sc.nextInt();
				System.out.println("Enter username: ");
				String name = sc.next();
				System.out.println("Enter user phone: ");
				long phone = sc.nextLong();
				System.out.println("Enter user city: ");
				String city = sc.next();
				
				StudentInfo st = new StudentInfo(id,name,phone,city);
				boolean ans1 = StudentDao.insertStudent(st);
				if(ans1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				break;
			case 2:
				System.out.println("Enter Student ID to DELETE: ");
				int del = sc.nextInt();
				boolean ans2 = StudentDao.deleteStudent(del);
				if(ans2) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Something went wrong");
				}
				break;
			case 3:
				StudentDao.displayStudent();
				break;
			case 4:
				System.out.println("Enter Student ID to UPDATE");
				int update = sc.nextInt();
				System.out.println("Enter new Name: ");
				String newname = sc.next();
				System.out.println("Enter new Phone Number: ");
				Long phoneno = sc.nextLong();
				System.out.println("Enter new City: ");
				String newcity = sc.next();
				
				boolean ans3 = StudentDao.updateStudent(update,newname,phoneno,newcity);
				if(ans3) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Something went wrong");
				}
				break;
			case 5:
				System.out.println("Enter ID to search: ");
				int id2 = sc.nextInt();
				boolean ans4 = StudentDao.searchStudent(id2);
				if(ans4) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Something went wrong");
				}
				break;
			}
			System.out.println("Thank You");
		} 
	} 
}
