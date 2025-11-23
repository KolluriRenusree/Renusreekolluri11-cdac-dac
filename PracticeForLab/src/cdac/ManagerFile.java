package cdac;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerFile {
	ArrayList<Student1>sl=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void addStudent1() throws IOException {
		FileOutputStream fs=new FileOutputStream("Student1");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		if(!sl.isEmpty()) {
			for(Student1 obj:sl) {
				System.out.println(obj);
			}
		}
		System.out.println("Enter Student id: ");
		int id=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		System.out.println("Enter Student Course: ");
		String course=sc.next();
		System.out.println("Enter Student Marks: ");
		int marks=sc.nextInt();
		Student1 obj=new Student1(id,name,course,marks);
		os.writeObject(obj);
		sl.add(obj);
		System.out.println("Student added successfully");
		
		
	}
	public void viewStudent1() throws IOException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream("Student1");
		ObjectInputStream os=new ObjectInputStream(fs);
		Student1 s;
		try {
		while(((s=(Student1)os.readObject())!=null)) {
			System.out.println(s.toString());
			
			
		}
		
		
		
	}
		catch(EOFException e) {
		
	}
		
	}
	public void updateStudent1() throws IOException {
		int flag=0;
		System.out.println("Enter Student id to update");
		int sid=sc.nextInt();
		for(Student1 obj :sl) {
			if(sid==obj.id) {
				System.out.println("Enter Marks to update: ");
				obj.setMarks(sc.nextInt());
				System.out.println("Updated Successfully");
				flag=1;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("Student id  not fount");
			
		}
		else {
			FileOutputStream fs=new FileOutputStream("Student1");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			for(Student1 obj:sl) {
			os.writeObject(obj);
			fs.close();
			}
			
		}
	}
	public void deleteStudent1() throws IOException {
		int flag=0;
		System.out.println("Enter Studenr id to delete");
		int sid=sc.nextInt();
		for(Student1 obj:sl) {
			if(sid==obj.id) {
				sl.remove(sl.indexOf(obj));
				System.out.println("Deleted successfully");
				flag=1;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("Student id not found");
			
		}
		else {
			FileOutputStream fs=new FileOutputStream("Student1");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			for(Student1 obj:sl) {
			os.writeObject(obj);	
		}
		
		
	}
	
	}

}
