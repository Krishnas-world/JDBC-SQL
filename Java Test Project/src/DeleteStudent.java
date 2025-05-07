import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
    public static void delete(Scanner sc) {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        String query = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConfig.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
