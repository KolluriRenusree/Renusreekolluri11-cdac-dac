package cdac;

public class Employee {
	int empid;
	String name;
	float salary;
	public Employee(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println(empid+" "+name+" "+salary);
	}

}
