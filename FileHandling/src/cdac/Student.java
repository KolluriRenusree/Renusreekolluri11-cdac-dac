package cdac;

import java.io.Serializable;

public class Student implements Serializable{
	int sid;
	String name;
	int marks;
	Student(int sid,String name,int marks){
		this.sid=sid;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		System.out.println("ID: " + sid + ", Name: " + name + ", Marks: " + marks);
	}

}
