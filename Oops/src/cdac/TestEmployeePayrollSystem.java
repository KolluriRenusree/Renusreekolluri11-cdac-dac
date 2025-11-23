package cdac;

public class TestEmployeePayrollSystem {
	public static void main(String args[]) {
		EmployeePayrollSystem e=new EmployeePayrollSystem(101,"renu",390000);
		EmployeePayrollSystem e1=new EmployeePayrollSystem(102,"ren",490000);
		e.display();
		e1.display();
	}
}
