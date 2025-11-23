package cdac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectWrite {
	public static void main(String[] args) throws IOException {
		
	
	Student s1=new Student(101,"renu",100);
	Student s2=new Student(102,"sneha",12);
	Student s3=new Student(103,"mahi",15);
	Student s4=new Student(104,"swapna",19);
	Student s5=new Student(105,"naini",13);
	FileOutputStream fs=new FileOutputStream("cdac123");
	ObjectOutputStream os=new ObjectOutputStream(fs);
	os.writeObject(s1);
	os.writeObject(s2);
	os.writeObject(s3);
	os.writeObject(s4);
	os.writeObject(s5);
	System.out.println("Object write is over");
	
	}

}
