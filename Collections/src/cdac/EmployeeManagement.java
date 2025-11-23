package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	public ArrayList<Employee> createEmpObj(){
		ArrayList<Employee>al=new ArrayList<>();
			
		Employee e1=new Employee(101,"Renusree",90000);
		Employee e2=new Employee(102,"Renu",80000);
		Employee e3=new Employee(103,"sree",70000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		return al;
	}
	public void displayEmp(ArrayList<Employee>al) {
		for(Employee obj :al) {
			obj.display();
			
		}
	}
	public void updateEmp(ArrayList<Employee>al) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
			int eid=sc.nextInt();
			for(Employee obj:al) {
		if(obj.empid==eid) {
			obj.sal=obj.sal+5000;
			
		}
			}
		
	}

}
