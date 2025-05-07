import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudentDynamic {
    public static void insertStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();

        String query = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
        try (Connection con = DBConfig.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, course);
            pstmt.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
