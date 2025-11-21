/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author KIIT
 */
public class connectionprovider {
    public static Connection getCon(){ 
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Vishal@1264");
//            return con;
//        } catch(Exception e) {
//           
//            return null;
//        }
Connection con = null;
//MY SERVER-->On AWS;
//https://us-east-1.console.aws.amazon.com/rds/home?region=us-east-1#databases:
        
      try {
            // Load the JDBC driver (MySQL Connector/J)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Define the JDBC URL for connecting to your MySQL server
            String url = "jdbc:mysql://mydb2.cgr8akhgkolj.us-east-1.rds.amazonaws.com:3306/user";
            String user = "admin";
            String password = "Project1264";
            
            // Establish the connection
            con = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection successful!");
        } catch (ClassNotFoundException e) {
            // Handle the case where the MySQL JDBC driver class is not found
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle SQL errors
            System.err.println("Connection failed.");
            e.printStackTrace();
        }
        
        return con;
    }
}


