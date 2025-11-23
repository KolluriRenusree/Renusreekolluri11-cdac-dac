package cdac;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainJdbc1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBCMan jm1=new JDBCMan();
		Connection con=jm1.createConnection();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1--> Select");
			System.out.println("2--> Insert");
			System.out.println("3-->Update");
			System.out.println("4-->Delete");
			System.out.println("Exit....");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				jm1.selectEmployee(con);
				break;
			case 2:
				jm1.insertEmployee(con);
				break;
			case 3:
				jm1.updateEmployee(con);
				break;
			case 4:
				jm1.deleteEmployee(con);
				break;
			case 5:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		while(choice!=6);
	}

}
