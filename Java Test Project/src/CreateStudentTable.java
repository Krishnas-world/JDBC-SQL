import java.sql.Connection;
import java.sql.Statement;

public class CreateStudentTable {
    public static void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS students (" +
                       "id INT AUTO_INCREMENT PRIMARY KEY, " +
                       "name VARCHAR(100), " +
                       "email VARCHAR(100), " +
                       "course VARCHAR(100))";
        try (Connection con = DBConfig.getConnection();
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'students' created or already exists.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}