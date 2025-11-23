package cdac;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("====== Student Management System ======");
            System.out.println("1. Create Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.createStudent(sc);
                case 2 -> service.viewStudents();
                case 3 -> service.updateStudent(sc);
                case 4 -> service.deleteStudent(sc);
                case 5 -> System.out.println("🚪 Exiting program...");
                default -> System.out.println("⚠️ Invalid choice, try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
