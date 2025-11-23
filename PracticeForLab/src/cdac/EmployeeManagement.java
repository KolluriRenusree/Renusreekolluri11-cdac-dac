package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	ArrayList<Employee>al=new ArrayList<>();
	public ArrayList<Employee> createObject(){
		//ArrayList<Employee>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Employee details");
		for(int i=0;i<3;i++) {
			System.out.println("Employee details "+(i+1));
			int id=sc.nextInt();
			String name=sc.next();
			float sal=sc.nextFloat();
			Employee e=new Employee(id,name,sal);
			al.add(e);
		}
		
//		Employee e1=new Employee(sc.nextInt(),sc.next(),sc.nextFloat());
//		Employee e2=new Employee(sc.nextInt(),sc.next(),sc.nextFloat());
//		Employee e3=new Employee(sc.nextInt(),sc.next(),sc.nextFloat());
//		al.add(e1);
//		al.add(e2);
//		al.add(e3);
		return al;
		
	}
	public void displayEmp() {
		for(Employee obj:al) {
			obj.display();
		}
	}
	public void updateEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id to update");
		int id=sc.nextInt();
		System.out.println("Enter salary to update");
		float sal=sc.nextFloat();
		for(Employee obj:al) {
			if(obj.empid==id) {
				obj.salary+=sal;
				
			}
			
		}
		System.out.println("updated");
	}
	public void deleteEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empid to Delete");
		int id=sc.nextInt();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).empid==id) {
				al.remove(i);
			}
		}
		System.out.println("Deleted");
	}

}
