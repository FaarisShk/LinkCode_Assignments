package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudent(StudentInfo st) {
		
		boolean f = false;
		try {
			Connection con = ConnectionMain.createConnection();
			String s1 = "insert into students values(?,?,?,?)";
			PreparedStatement ps1 = con.prepareStatement(s1);
			ps1.setInt(1, st.getStudentId());
			ps1.setString(2, st.getStudentName());
			ps1.setLong(3, st.getStudentPhone());
			ps1.setString(4, st.getStudentCity());
			ps1.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return f;
	}

	public static boolean deleteStudent(int del) {
		
		boolean f = false;
		try {
			Connection con = ConnectionMain.createConnection();
			String s1 = "delete from students where sid=?";
			PreparedStatement ps1 = con.prepareStatement(s1);
			ps1.setInt(1,del);
			ps1.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return f;
	}

	public static boolean displayStudent() {
		boolean f = false;
		try {
			Connection con = ConnectionMain.createConnection();
			String s1 = "select * from students";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(s1);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Long no = rs.getLong(3);
				String city  = rs.getString(4);
				
				System.out.println("ID: "+ id);
				System.out.println("Name: " + name);
				System.out.println("Number: " + no);
				System.out.println("City: " + city);
			}
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return f;
	}

	public static boolean updateStudent(int update, String newname, Long phoneno, String newcity) {
		boolean f = false;
		try {
			Connection con = ConnectionMain.createConnection();
			String s1 = "update students set sname=?,sphone=?,scity=? where sid=?";
			PreparedStatement ps1 = con.prepareStatement(s1);
			ps1.setString(1, newname);
			ps1.setLong(2, phoneno);
			ps1.setString(3, newcity);
			ps1.setInt(4, update);
			ps1.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return f;
	}

	public static boolean searchStudent(int id2) {
		boolean f = false;
		try {
			Connection con = ConnectionMain.createConnection();
			String s1 = "select * from students";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(s1);
			
			while(rs.next()) {
				if(rs.getInt(1)==id2) {
					f = true;
				} else {
					System.out.println("Record not Found");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
