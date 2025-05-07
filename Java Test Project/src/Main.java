
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create one Scanner only
        int choice = 0;

        do {
            System.out.println("\n=== STUDENT DATABASE MENU ===");
            System.out.println("1. Create Student Table");
            System.out.println("2. Insert New Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Update Student Info");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); // Clear the invalid input
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // Clear the newline

            switch (choice) {
                case 1:
                    CreateStudentTable.createTable();
                    break;
                case 2:
                    InsertStudentDynamic.insertStudent(sc); // pass Scanner
                    break;
                case 3:
                    DisplayStudents.display();
                    break;
                case 4:
                    UpdateStudent.update(sc); // pass Scanner
                    break;
                case 5:
                    DeleteStudent.delete(sc); // pass Scanner
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }

        } while (choice != 6);

        ; // Close only at the very end
    }
}
