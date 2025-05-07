import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudents {
    public static void display() {
        String query = "SELECT * FROM students";

        try (Connection con = DBConfig.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
