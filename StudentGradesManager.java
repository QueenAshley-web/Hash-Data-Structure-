import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        // HashMap to store student grades
        HashMap<Integer, String> studentGrades = new HashMap<>();

        // Pre-populate some data
        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "C");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Grades Management System");
            System.out.println("1. Add/Update Student Grade");
            System.out.println("2. Get Student Grade");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add or Update Grade
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.next();
                    studentGrades.put(id, grade);
                    System.out.println("Grade added/updated successfully.");
                    break;

                case 2: // Get Grade
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    if (studentGrades.containsKey(id)) {
                        System.out.println("Grade for Student ID " + id + ": " + studentGrades.get(id));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3: // Remove Student
                    System.out.print("Enter Student ID: ");
                    id = scanner.nextInt();
                    if (studentGrades.remove(id) != null) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Display All Students
                    System.out.println("All Students and Grades:");
                    for (HashMap.Entry<Integer, String> entry : studentGrades.entrySet()) {
                        System.out.println("ID: " + entry.getKey() + ", Grade: " + entry.getValue());
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}