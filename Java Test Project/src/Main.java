
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== STUDENT DATABASE MENU ===");
            System.out.println("0. Create Database");
            System.out.println("1. Create Student Table");
            System.out.println("2. Insert New Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Update Student Info");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    CreateDB.createDatabase();
                    break;
                case 1:
                    CreateStudentTable.createTable();
                    break;
                case 2:
                    InsertStudentDynamic.insertStudent(sc);
                    break;
                case 3:
                    DisplayStudents.display();
                    break;
                case 4:
                    UpdateStudent.update(sc);
                    break;
                case 5:
                    DeleteStudent.delete(sc);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
