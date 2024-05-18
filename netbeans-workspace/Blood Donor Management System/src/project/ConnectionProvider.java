/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import  java.sql.*;
/**
 *
 * @author tuananhchaukhac
 */
public class ConnectionProvider {
    
    public static Connection getCon() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Correct JDBC URL
            String url = "jdbc:sqlserver://localhost:1434;databaseName=BloodDonation";
            String user = "sa";
            String password = "123456";
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (ClassNotFoundException e) {
            // Log and handle the exception
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Log and handle the exception
            System.err.println("Connection failed.");
            e.printStackTrace();
        }
        return null;
    }
}
