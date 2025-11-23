package cdac;

public class Teacher {
	int id;
	String name;
	float salary;
	String job;
	public Teacher(int id, String name, float salary, String job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", job=" + job + "]";
	}
	
	

}
