package cdac;

public class TestStudent {

	public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Renu", 90, 85, 95),
                new Student(2, "Sree", 70, 60, 80)
        };
        for(int i=0;i<students.length;i++) {
        	students[i].display();
        }
    }
}

