package cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCManage {
	public Connection createConnection() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","9959renu@");
	return con;
	
	
}
	public void addBook(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title,author,price,quantity to add to database");
		String title=sc.next();
		String author=sc.next();
		double price=sc.nextDouble();
		int quantity=sc.nextInt();
		String q1="insert into Books(title,author,price,quantity)values(?,?,?,?)";
		PreparedStatement pmt1=con.prepareStatement(q1);
		pmt1.setString(1, title);
		pmt1.setString(2, author);
		pmt1.setDouble(3, price);
		pmt1.setInt(4, quantity);
		int nor1=pmt1.executeUpdate();
		System.out.println("Updated"+nor1);
		
	}
	public void allBooksRetrive(Connection con) throws SQLException {
		String q2="select * from Books";
		PreparedStatement pmt2=con.prepareStatement(q2);
		ResultSet rs=pmt2.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5));
		}
	
		
	}
	public void displayWithid(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id to display");
		int bid=sc.nextInt();
		String q3="select * from Books Where id=?";
		PreparedStatement pmt3=con.prepareStatement(q3);
		pmt3.setInt(1, bid);
		ResultSet rs1=pmt3.executeQuery();
		if(rs1.next()) {
		System.out.println(rs1.getInt(1)+ " "+ rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getDouble(4)+" "+rs1.getInt(5));
		}
		else {
			System.out.println("book not found");
		}
	}
	public void updateBook(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book id to update");
		int bid=sc.nextInt();
		System.out.println("Enter Price to update");
		double price=sc.nextDouble();
		System.out.println("Enter the Quantity to update");
		int qty=sc.nextInt();
		String q4="update Books set price=?,quantity=? where id=?";
		PreparedStatement pmt4=con.prepareStatement(q4);
		pmt4.setDouble(1,price);
		pmt4.setInt(2, qty);
		pmt4.setInt(3, bid);
		int nors2=pmt4.executeUpdate();
		System.out.println("Updated"+nors2);
	}
	public void  deleteBook(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id to delete");
		int bid=sc.nextInt();
		String q5="delete from Books where id=?";
		PreparedStatement pmt5=con.prepareStatement(q5);
		pmt5.setInt(1,bid);
		int nor3=pmt5.executeUpdate();
		System.out.println("Deleted"+nor3);
		
		
	}
	public void checkAvailability(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id to check");
		int bid=sc.nextInt();
		System.out.println("Enter Quantity");
		int qty=sc.nextInt();
		String q6="select quantity from Books where id=?";
		PreparedStatement pmt6=con.prepareStatement(q6);
		pmt6.setInt(1, bid);
		ResultSet rs2=pmt6.executeQuery();
		if(rs2.next()) {
			int availableqty=rs2.getInt("quantity");
			if(availableqty>=qty) {
				System.out.println("Book issued Successfully");
				
			}
			else {
				System.out.println("Insufficient Books");
			}
			
		}
		else {
			System.out.println("Book id not found");
		}
		
		
	}
	
}
