package cdac;

import java.util.Scanner;

class Employee {
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
		
	}
	void display()
	{
		System.out.println("Name: "+name+" salary: "+salary);
		
	}
	

}
class Manager extends Employee{
	int teamsize;
	Manager(String name,int salary,int teamsize){
		super(name,salary);
		this.teamsize=teamsize;
	
	}
	void calculatebonus() {
		double bouns=teamsize*1000;
		double total=salary+bouns;
		System.out.println("Bouns is: "+bouns);
		System.out.println("Total Salary is: "+total);
	}
	
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Manager Name: ");
		 String name=sc.next();
		 System.out.println("Enter salary:  ");
		 int salary=sc.nextInt();
		 System.out.println("Enter teamsize: ");
		 int teamsize=sc.nextInt();
		 Manager m=new Manager(name,salary,teamsize);
		 m.display();
		 m.calculatebonus();
		 
		 
	 }
	
}
