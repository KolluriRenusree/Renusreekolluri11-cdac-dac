package cdac;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	Scanner sc=new Scanner(System.in);
	ArrayList<Student1>sl=new ArrayList<>();
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
		System.out.println("Enter Student name: ");
		String name=sc.next();
		System.out.println("Enter Student Course: ");
		String course=sc.next();
		System.out.println("Enter  Student Marks: ");
		int marks=sc.nextInt();
		Student1 obj=new Student1(id,name,course,marks);
		os.writeObject(obj);
		sl.add(obj);
		System.out.println("Students Added Successfully...");
		fs.close();
	}
	public void viewStudent1() throws IOException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream("Student1");
		ObjectInputStream os=new ObjectInputStream(fs);
		Student1 s;
		try {
			while(((s=(Student1)os.readObject())!=null)) {
				System.out.println(s.toString());
				
			}
			fs.close();
		}
		catch(EOFException e) {
			
		}
	}
	public void updateStudent1() throws IOException {
		System.out.println("Enter id of the student to update the marks: ");
		int sid=sc.nextInt();
		 int flag=0;
		 for(Student1 obj:sl) {
			 if(sid==obj.id) {
				 System.out.println("Enter Marks to update: ");
				 obj.setMarks(sc.nextInt());
				 System.out.println("Student Updated Successfully");
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0) {
			 System.out.println("Student id not found");
		 }else {
			 FileOutputStream fs=new FileOutputStream("Student1");
			 ObjectOutputStream os=new ObjectOutputStream(fs);
			 for(Student1 obj:sl) {
				 os.writeObject(obj);
			 }
			 fs.close();
		 }
		
			 
		 }
	public void deleteStudent1() throws IOException {
		System.out.println("Enter Student id to delete: ");
		int sid=sc.nextInt();
		int flag=0;
		for(Student1 obj :sl) {
			if(sid==obj.id) {
				sl.remove(sl.indexOf(obj));
				System.out.println("Student Deleted Successfully");
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
				fs.close();
			}
		}
	}
	
		 
	}



