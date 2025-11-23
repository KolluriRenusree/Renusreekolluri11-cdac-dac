package cdac;

public class Employee {
	
	int empid;
	String name;
	double sal;
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	void display() {
		System.out.println(empid+name+sal);
	}

}
