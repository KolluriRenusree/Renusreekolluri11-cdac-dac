package cdac;

import java.util.Scanner;

public class TeacherMain {
	public static void main(String[] args) {
		TeacherManagement tm=new TeacherManagement();
//		tm.addTeacher();
//		tm.displayTeacher();
//		tm.updateTeacher();
//		tm.deleteTeacher();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1-->Add Teacher");
			System.out.println("2-->Display");
			System.out.println("3-->Update");
			System.out.println("4-->Delete");
			System.out.println("5-->Total");
			System.out.println("6--> Exit");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				tm.addTeacher();
				break;
			case 2:
				tm.displayTeacher();
				break;
			case 3:
				tm.updateTeacher();
				
				break;
				
			case 4:
				tm.deleteTeacher();
				break;
			case 5:
				tm.totalSalary();
				break;
			case 6:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
			
		}
		while(choice!=7);
		
}

}
