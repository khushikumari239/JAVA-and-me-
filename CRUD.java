import java.sql.*;

public class JDBCCRUDExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace 'mydb' with your database name
        String user = "root";                             // Replace with your MySQL username
        String password = "password";                     // Replace with your MySQL password

        try {
            // Step 1: Load JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // ------------------ CREATE ------------------
            String insertQuery = "INSERT INTO users(name, email) VALUES (?, ?)";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
            insertStmt.setString(1, "Khushi");
            insertStmt.setString(2, "khushi@example.com");
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println("Inserted: " + rowsInserted + " row(s)");

            // ------------------ READ ------------------
            String selectQuery = "SELECT * FROM users";
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            ResultSet rs = selectStmt.executeQuery();
            System.out.println("\nUser Table:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + " | " + name + " | " + email);
            }

            // ------------------ UPDATE ------------------
            String updateQuery = "UPDATE users SET email = ? WHERE name = ?";
            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
            updateStmt.setString(1, "newkhushi@example.com");
            updateStmt.setString(2, "Khushi");
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("\nUpdated: " + rowsUpdated + " row(s)");

            // ------------------ DELETE ------------------
            String deleteQuery = "DELETE FROM users WHERE name = ?";
            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
            deleteStmt.setString(1, "Khushi");
            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println("\nDeleted: " + rowsDeleted + " row(s)");

            // Step 3: Close the connection
            con.close();
            System.out.println("\nConnection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
