import java.sql.*;

public class SqlInjectionExample {
    public static void main(String[] args) {
        String username = "' OR '1'='1";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user", "pass");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("Welcome " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
