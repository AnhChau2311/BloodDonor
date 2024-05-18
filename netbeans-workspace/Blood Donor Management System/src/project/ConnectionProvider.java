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
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Correct JDBC URL
            String url = "jdbc:mysql://localhost:3306/BloodDonation?useSSL=false&serverTimezone=UTC";
            String user = "root";
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
