package cdac;

import java.util.Scanner;

class Student {
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
		void showDetails() {
			System.out.println("Name: "+name);
			System.out.println("Marks: "+marks);
			
		}
		

}
class GraduateStudent extends Student{
	String specialization;
	GraduateStudent(String name,int marks,String specialization){
		super(name,marks);
		this.specialization=specialization;
	}
	void checkpass() {
		if(marks>=50) {
			System.out.println("The Student is Passed: "+marks);
		}
		else
			System.out.println("The Student is Failed: "+marks);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		System.out.println("Enter Student Marks: ");
		int marks=sc.nextInt();
		System.out.println("Enter Specialization: ");
		String specialization=sc.next();
		GraduateStudent gs=new GraduateStudent(name,marks,specialization);
		gs.showDetails();
		gs.checkpass();
		
		
	}
	
	
}
