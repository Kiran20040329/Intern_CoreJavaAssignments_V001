package Interns_CoreJavaAssignments_V001;
import java.util.*;
class Student {
    private String name;
    private int rollNumber;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Display student details
    @Override
    public String toString() {
        return name + " (Roll Number: " + rollNumber + ")";
    }
}

public class StudentDataBaseArrayList {
	private static ArrayList<Student> studentList = new ArrayList<>();

    // Add a student to the database
    public static void addStudent(String name, int rollNumber) {
        studentList.add(new Student(name, rollNumber));
        System.out.println("Student added successfully.");
    }

    // Remove a student by roll number
    public static void removeStudent(int rollNumber) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                studentList.remove(student);
                System.out.println("Student removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    // Display all students in the database
    public static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("Students in the database:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Database Management");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.next();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = sc.nextInt();
                    addStudent(name, rollNumber);
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = sc.nextInt();
                    removeStudent(rollToRemove);
                    break;

                case 3:
                    displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();

	}

}
