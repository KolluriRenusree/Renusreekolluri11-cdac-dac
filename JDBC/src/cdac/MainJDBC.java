package cdac;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JDBCManagement jm=new JDBCManagement();
		Connection con=jm.createConnection();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1-->Select");
			System.out.println("2-->Insert");
			System.out.println("3-->Update");
			System.out.println("4-->Delete");
			System.out.println("5-->Exit");
			 choice=sc.nextInt();
			switch(choice) {
			case 1:
				jm.selectEmployee(con);
				break;
			case 2:
				jm.insertEmployee(con);
				break;
			case 3:
				jm.updateEmployee(con);
				break;
			case 4:
				jm.deleteEmployee(con);
				break;
			case 5:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
		}
		while(choice!=6);
		
//		jm.selectEmployee(con);
//		jm.insertEmployee(con);
//		jm.updateEmployee(con);
//		jm.deleteEmployee(con);
//		
	}

}
