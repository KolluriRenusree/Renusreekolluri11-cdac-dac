package cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCManagement {
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dac","root","9959renu@");
		return con;
		
	}
	public void selectEmployee(Connection con) throws SQLException {
		String q1="select * from Employee";
		PreparedStatement pmt1=con.prepareStatement(q1);
		ResultSet rs1=pmt1.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+ " "+rs1.getString(2)+ " "+rs1.getFloat(3)+" "+rs1.getString(4));
		}
		
	}
	public void insertEmployee(Connection con) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter empid,name,salary,job: ");
	int id=sc.nextInt();
	String name=sc.next();
	float sal=sc.nextFloat();
	String job=sc.next();
	String q2="insert into Employee values(?,?,?,?)";
	PreparedStatement pmt2=con.prepareStatement(q2);
	pmt2.setInt(1,id);
	pmt2.setString(2, name);
	pmt2.setFloat(3, sal);
	pmt2.setString(4, job);
	int nor1=pmt2.executeUpdate();
	System.out.println("Inserted"+nor1);
	}
	public void updateEmployee(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empno  & Salary to update");
		int id=sc.nextInt();
		float sal=sc.nextFloat();
		String q3="update Employee set salary=salary+? where empid=?";
		PreparedStatement pmt3=con.prepareStatement(q3);
		pmt3.setFloat(1, sal);
		pmt3.setInt(2,id);
		int nor2=pmt3.executeUpdate();
		System.out.println("Updated "+nor2);
		
		
		
	}
	public void deleteEmployee(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to delete: ");
		int id=sc.nextInt();
		String q4="delete  from Employee where empid=?";
		PreparedStatement pmt4=con.prepareStatement(q4);
		pmt4.setInt(1,id);
		int nor3=pmt4.executeUpdate();
		System.out.println("Deleted"+nor3);
		
		
		
	}
}