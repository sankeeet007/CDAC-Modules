package com.cdac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class userInputJDBC {
    public static void main(String[] args){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_db", "batch163184", "cdac");
                Statement stmt = conn.createStatement();
                Scanner sc = new Scanner(System.in);
        ){
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Username: ");
            String userName = sc.next();
            System.out.println("Enter Password: ");
            String password = sc.next();
            System.out.println("Enter Email: ");
            String email = sc.next();
            System.out.println("Enter City: ");
            String city = sc.next();

            String insertQuery = "insert into users values('"+name+"','"+userName+"','"+password+"','"+email+"','"+city+"');";
            stmt.executeUpdate(insertQuery);
            System.out.println("Data Saved!");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
