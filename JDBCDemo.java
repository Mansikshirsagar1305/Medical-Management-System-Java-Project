import java.sql.*;
public class JDBCDemo{
    public static void main(String args[]) {
        try {
            // Load the Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded");

            // Establish connection with Oracle 21c XE (using XEPDB1)
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "system", "manager")) {
                System.out.println("Connected to Oracle 21c XE Successfully");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver Not Found! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection Failed! " + e.getMessage());
        }
    }
}
