package cdac;
class Student{
	//private variable for data hiding
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0)
		this.age = age;
		else
			System.out.println("Age Must be in positive");
	}
	
	
}

public class CapsuleMedicineExample {
	public static void main(String[] args) {
		Student s=new Student("Renu",22);
		s.setName("renusree");
		s.setAge(21);
		System.out.println("Updated Name is "+s.getName());
		System.out.println("Updated age is "+s.getAge());
			
	}

}
