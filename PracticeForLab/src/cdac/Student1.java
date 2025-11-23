package cdac;

import java.io.Serializable;

public class Student1 implements Serializable {
	int id;
	String name;
	String course;
	int marks;
	public Student1(int id, String name, String course, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
}
