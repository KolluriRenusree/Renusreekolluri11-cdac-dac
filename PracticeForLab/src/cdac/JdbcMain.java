package cdac;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBCManage j=new JDBCManage();
		Connection con=j.createConnection();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1-->Add Books");
			System.out.println("2-->View AllBooks");
			System.out.println("3-->Search Book bi ID");
			System.out.println("4-->Update Book");
			System.out.println("5-->Delete Book");
			System.out.println("6-->Check Availability");
			System.out.println("7--> Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				j.addBook(con);
				break;
			case 2:
				j.allBooksRetrive(con);
				break;
			case 3:
				j.displayWithid(con);
				break;
			case 4:
				j.updateBook(con);
				break;
			case 5:
				j.deleteBook(con);
				break;
			case 6:
				j.checkAvailability(con);
				break;
			case 7:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice");
			}
			
		}
		while(choice!=8);
//		j.addBook(con);
//		j.allBooksRetrive(con);
//		j.displayWithid(con);
//		j.updateBook(con);
		
	}

}
