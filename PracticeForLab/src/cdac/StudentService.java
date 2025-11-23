package cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	FileHandler fh=new FileHandler ();
	public void createStudent(Scanner sc) {
		List<FileHandlingStudent>List=FileHandler.loadStudents();
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		sc.nextLine();
	
		for (FileHandlingStudent s : List) {
	        if (s.getId() == id) {
	            System.out.println("⚠️ Student with this ID already exists!");
	            return;
        }
//		sc.nextLine();
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter Course");
		 String course =sc.nextLine();
		System.out.println("Enter Marks: ");
		int marks =sc.nextInt();
		 FileHandlingStudent std1 = new FileHandlingStudent(id, name, course, marks);
	        List.add(std1);
	        FileHandler.saveStudents(new ArrayList<>(List));
	        System.out.println("Student added successfully.\n");
		
	}
	}
	 public void viewStudents() {
	        List<FileHandlingStudent> List = FileHandler.loadStudents();
	        if (List.isEmpty()) {
	            System.out.println(" No students found.\n");
	        } else {
	            System.out.println(" Student Records:");
	            for (FileHandlingStudent s : List) {
	                System.out.println(s);
	            }
	            System.out.println();
	        }
	    }
	 public void updateStudent(Scanner sc) {
	        List<FileHandlingStudent> stdList = FileHandler.loadStudents();
	        System.out.print("Enter student id to update: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        boolean found = false;
	        for (FileHandlingStudent s : stdList) {
	            if (s.getId() == id) {
	                System.out.print("Enter new course: ");
	                String course = sc.nextLine();
	                System.out.print("Enter new marks: ");
	                int marks = sc.nextInt();

	                s.setCourse(course);
	                s.setMarks(marks);
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            FileHandler.saveStudents(new ArrayList<>(stdList));
	            System.out.println("Student updated successfully.\n");
	        } else {
	            System.out.println("Student with ID " + id + " not found.\n");
	        }
	    }

	    // Delete student
	    public void deleteStudent(Scanner sc) {
	        List<FileHandlingStudent> stdList = FileHandler.loadStudents();
	        System.out.print("Enter student id to delete: ");
	        int id = sc.nextInt();

	        boolean removed = stdList.removeIf(s -> s.getId() == id);

	        if (removed) {
	            FileHandler.saveStudents(new ArrayList<>(stdList));
	            System.out.println("Student deleted successfully.\n");
	        } else {
	            System.out.println("Student with ID " + id + " not found.\n");
	        }
	    }
	}



