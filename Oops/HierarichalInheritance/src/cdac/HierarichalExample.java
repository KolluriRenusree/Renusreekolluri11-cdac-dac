package cdac;
class Person{
	int sid;
	String name;
	String address;
	 Person(int sid, String name, String address) {
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	 void displayPerson() {
		 System.out.println(sid+name+address);
	 }
}
class Student extends Person{
	int marks;
	 Student(int sid, String name, String address,int marks) {
		super(sid,name,address);
		this.marks=marks;
	 }
	 
	 void displayStudent() {
		 System.out.println(sid+name+ address+marks);
	 }
		void displayresult() {
			if(marks>16)
				System.out.println("pass");
			else
				System.out.println("fail");
		
	}

}
class Teacher extends Person{
	float sal;
	Teacher(int sid,String name,String address,float sal){
		super(sid,name,address);
		this.sal=sal;
	}
	void displayTeacher() {
		System.out.println(sid+name+address+sal);
	}
	void findbonous() {
		float bonus=sal*0.2f;
		System.out.println(bonus);
	}
}

public class HierarichalExample {
	public static void main(String args[]) {
		
		
		Student s=new Student(101,"renu","dam",99);
		s.displayPerson();
		s.displayStudent();
		s.displayresult();
		Teacher t=new Teacher(102,"sree","blr",50000);
		t.displayTeacher();	
		t.findbonous();
		
		
		
	}

}
