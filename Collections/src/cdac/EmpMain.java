package cdac;

import java.util.ArrayList;

public class EmpMain {
	public static void main(String[] args) {
		EmployeeManagement em=new EmployeeManagement();
		ArrayList<Employee> al = em.createEmpObj();
		em.createEmpObj();
		em.displayEmp(al);
		System.out.println("After Update: ");
		em.updateEmp(al);
		em.displayEmp(al);
		
	}

}
