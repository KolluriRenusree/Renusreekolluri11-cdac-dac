package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeManagement em=new EmployeeManagement();
		ArrayList<Employee>al=em.createObject();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1-->Display");
			System.out.println("2-->Update");
			System.out.println("3-->Delete");
			System.out.println("4-->Exit");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				em.displayEmp();
				break;
			case 2:
				em.updateEmp();
				break;
			case 3:
				em.deleteEmployee();
				break;
			case 4:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
			
		}
		while(choice!=5);
//		//em.createObject();
//		em.displayEmp(al);
//		em.updateEmp(al);
//		em.deleteEmployee(al);
//		System.out.println("After Update");
//		em.displayEmp(al);
	}

}
