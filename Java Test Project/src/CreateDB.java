import java.sql.*;

public class CreateDB {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Krishnapallan@123"; // Consider moving to a config
    private static final String DB_NAME = "mydb";

    public static void createDatabase() {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SHOW DATABASES LIKE '" + DB_NAME + "'")) {

            if (rs.next()) {
                System.out.println("Database " + DB_NAME + " already exists.");
            } else {
                String query = "CREATE DATABASE " + DB_NAME;
                stmt.executeUpdate(query);
                System.out.println("Database " + DB_NAME + " created successfully!");
            }

        } catch (SQLException e) {
            if (e.getErrorCode() == 1007) {
                System.out.println("Database " + DB_NAME + " already exists.");
            } else {
                System.out.println("Error creating database: " + e.getMessage());
            }
        }
    }
}
