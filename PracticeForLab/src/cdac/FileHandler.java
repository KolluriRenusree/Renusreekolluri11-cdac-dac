package cdac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileHandler {
	public static final String file_name="Student.dat";
	//read all students;
	public ArrayList<FileHandlingStudent>fs=new ArrayList<>();
	 public static void saveStudents(ArrayList<FileHandlingStudent> fs) {
	        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file_name))) {
	            os.writeObject(fs);
	            System.out.println("Students saved successfully.");
	        } catch (IOException e) {
	            System.out.println("Error saving students: " + e.getMessage());
	        }
	    }
	 public static ArrayList<FileHandlingStudent> loadStudents() {
	        File file = new File(file_name);
	        if (!file.exists()) {
	            return new ArrayList<>(); // Return empty list if file doesn't exist
	        }
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file_name))) {
	            return (ArrayList<FileHandlingStudent>) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error reading students: " + e.getMessage());
	            return new ArrayList<>();
	        }
	    }

	 
	
			
	 }

