package cdac;

import java.io.Serializable;

public class FileHandlingStudent implements Serializable {
	int id;
	String name;
	String course;
	int marks;
	public FileHandlingStudent(int id, String name, String course, int marks) {
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

	public String getGrade( ) {
		if(marks>90) {
			return "A";
		}
		else if(marks>75) {
			return "B";
		}
		else if(marks>65) {
			return "C";
		}
		else if(marks>50){
			return "D";
		
	}
		else {
			return "fail";
		}
		
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + ", Grade="+getGrade()+"]";
	}
	
	
	
	

}
