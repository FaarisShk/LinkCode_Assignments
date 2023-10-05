import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeInfo {
	Connection con= null;
	PreparedStatement ps1 = con.prepareStatement("insert into employee values (?,?,?,?)");
	ps1.
	
	int i1 = ps1.executeUpdate();
	if(i1>0)
	{
		System.out.println("Record Inserted");
	} else {
		System.out.println("Not Inserted");
	}
	//Update Statement
	PreparedStatement ps2 = con.prepareStatement("update employee set salary = ? where empid = ?");
	ps2.setInt(1, 50000);
	ps2.setInt(2, 111);
	
	int i2 = ps2.executeUpdate();
	if(i2>0) {
		System.out.println("Record Updated");
	} else {
		System.out.println("No Updated");
	}
	//Delete Statement
	PreparedStatement ps3 = con.prepareStatement("delete from employee where empid = ?");
	ps3.setInt(1, 111);
	
	int i3 = ps3.executeUpdate();
	if(i3>0) {
		System.out.println("Record Deleted");
	} else {
		System.out.println("Record Not Deleted");
	}
	//Search Statement
	PreparedStatement ps4 = con.prepareStatement("select * from employee where empid = ?");
	ps4.setInt(1, 111);
	ResultSet rs = ps4.executeQuery();
	rs.next();
	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	//Display Statement
	String str = "Select * from employee";
	Statement st = (Statement) con.createStatement();
}
