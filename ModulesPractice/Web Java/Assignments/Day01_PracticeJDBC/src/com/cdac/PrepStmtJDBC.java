package com.cdac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepStmtJDBC {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_db", "batch163184", "cdac");
                PreparedStatement preparedStatement = connection.prepareStatement("Insert into users values(?, ?, ?, ?, ?)");
                Statement statement = connection.createStatement();
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

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, city);
            preparedStatement.executeUpdate();
            System.out.println("Saved!");
        }catch(SQLException e){
                e.printStackTrace();
        }
    }
}
