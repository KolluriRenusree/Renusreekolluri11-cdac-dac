package cdac;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFileRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("cdac123");
		ObjectInputStream os=new ObjectInputStream(fi);
		Student s;
		
		try {
		while((s=(Student)os.readObject())!=null) {
			s.display();
			findResult(s);
		}
		}		
		catch(EOFException e) {
			System.out.println("end");
		}
	}
		public static void findResult(Student s) {
			if(s.marks>16) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
				}
			}
		
	

}
