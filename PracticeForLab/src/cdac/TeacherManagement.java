package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManagement {
	ArrayList<Teacher>tl=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public ArrayList<Teacher> addTeacher(){
		System.out.println("Enter Teacher Details: ");
		for(int i=0;i<2;i++) {
			System.out.println("Enter Teacher Details: "+(i+1));
			int id=sc.nextInt();
			String name=sc.next();
			float salary=sc.nextFloat();
			String job=sc.next();
			Teacher t1=new Teacher(id,name,salary,job);
			tl.add(t1);
			System.out.println("Added");
			
		}
		return tl;
	}
	public void displayTeacher() {
		for(Teacher obj:tl) {
			System.out.println(obj.toString());
			
		}
	}
	public void updateTeacher() {
		int flag=0;
		System.out.println("Enter Employee id to update: ");
		int eid=sc.nextInt();
		for(Teacher obj:tl) {
		if(eid==obj.id) {
			System.out.println("Enter salary to update: ");
			obj.salary=sc.nextInt();
			flag=1;
			break;
			
			
			
		}
		}
		System.out.println("Updated");
	}
	public void deleteTeacher() {
		System.out.println("Enter Teacher id to delete: ");
		int tid=sc.nextInt();
		for(Teacher obj:tl) {
			if(tid==obj.id) {
				tl.remove(tl.indexOf(obj));
			}
		}
		System.out.println("Deleted");
		
	}
	public void totalSalary() {
		 float sum=0;
		for(Teacher obj:tl) {
			sum+=obj.salary;
//			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
