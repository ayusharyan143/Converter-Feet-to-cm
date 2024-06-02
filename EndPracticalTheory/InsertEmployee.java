package EndPracticalTheory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Prepare statement to insert employee data
            String sql = "INSERT INTO Employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Insert employee data
            preparedStatement.setInt(1, 101); // Employee ID
            preparedStatement.setString(2, "John Doe"); // Employee name
            preparedStatement.setString(3, "IT"); // Employee department
            preparedStatement.setString(4, "50000"); // Employee salary
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new employee has been inserted successfully.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close JDBC objects
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
