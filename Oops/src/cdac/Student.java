package cdac;

public class Student {
	int rollno;
	String name;
	int marks[]=new int[3];
	
	Student(int rollno,String name,int m1,int m2,int m3) {
		this.rollno=rollno;
		this.name=name;
		marks[0]=m1;
		marks[1]=m2;
		marks[2]=m3;
	}
	double average() {
		return (marks[0]+marks[1]+marks[2])/3.0;
	}
	String grade() {
		double avg=average();
		if(avg>=90)
			return "A";
		else if(avg>=70)
			return "B";
		else if(avg>=45)
			return "C";
		else
			return "fail";
		
	}
	void display() {
		System.out.println("Rollno: "+rollno+ " Name: "+name+" Average: "+average()+" Grade: "+grade());
	}
	
	
}
