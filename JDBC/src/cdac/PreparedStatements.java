package cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatements {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dac","root","9959renu@");
		System.out.println("got Connection");
		//Insert
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid,name,salary,job to insert ");
		int id=sc.nextInt();
		String name=sc.next();
		float sal=sc.nextFloat();
		String job=sc.next();
		String q1="insert into Employee values(?,?,?,?)";
		PreparedStatement pmt1=con.prepareStatement(q1);
		pmt1.setInt(1,id);
		pmt1.setString(2, name);
		pmt1.setFloat(3, sal);
		pmt1.setString(4, job);
		int nos=pmt1.executeUpdate();
		System.out.println(nos+"created");
		// Update
		System.out.println("Enter empid and salary to update");
		int id1=sc.nextInt();
		float sal1=sc.nextFloat();
		String q2="update Employee set salary=salary+? where empid=?";
		PreparedStatement pmt2=con.prepareStatement(q2);
		pmt2.setFloat(1, sal1);
		pmt2.setInt(2, id1);
		int nor1=pmt2.executeUpdate();
		System.out.println(nor1+"Updated");
		//Select
		System.out.println("Enter emid ");
		int id2=sc.nextInt();
		String q3="select * from Employee where empid=?";
		PreparedStatement pmt3=con.prepareStatement(q3);
		pmt3.setInt(1, id2);
		ResultSet rs1=pmt3.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+ " "+rs1.getString(2)+ " "+rs1.getFloat(3)+" "+rs1.getString(4));
		}
		// Delete
		System.out.println("Enter emid to delete");
		int id3=sc.nextInt();
		String q4="delete from Employee where empid=?";
		PreparedStatement pmt4=con.prepareStatement(q4);
		pmt4.setInt(1, id3);
		int nor3=pmt4.executeUpdate();
		System.out.println(nor3+" Deleted");
		
		
		pmt1.close();
		con.close();
		sc.close();
		
		
		
	}

}
