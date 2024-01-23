package travelbookingmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TravelBookingManagement {

    public static void main(String[] args) {
        
       String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Final;encrypt=true;trustServerCertificate=true";
        
        try (Connection connection = DriverManager.getConnection(connectionString, "sa", "$eadSead1")) {
            System.out.println("Connection established!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
}
