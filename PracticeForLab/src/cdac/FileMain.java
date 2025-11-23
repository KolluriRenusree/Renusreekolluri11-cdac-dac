package cdac;

import java.io.IOException;
import java.util.Scanner;

public class FileMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ManagerFile fm=new ManagerFile();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n          MENU            \n1.AddStudent\n2.View all Students\n3.Update Student"
					+ "\n4.Delete Student\n5.Exit\nEnter Your Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				fm.addStudent1();
				break;
			case 2:
				fm.viewStudent1();
				break;
			case 3:
				fm.updateStudent1();
				break;
			case 4:
				fm.deleteStudent1();
				break;
			case 5:
				System.out.println("Exiting ");
			default:
				System.out.println("Invalid Choice");
			
			}
		}
		while(choice!=6);
	}

}
