package cdac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/dac","root","9959renu@");
		System.out.println("got connection");
		Statement smt=con.createStatement();
		String q="select * from Employee";
		ResultSet rs=smt.executeQuery(q);
		while(rs.next()){
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getFloat(3)+ " "+rs.getString(4));
			
		}
		
		
	}

}
