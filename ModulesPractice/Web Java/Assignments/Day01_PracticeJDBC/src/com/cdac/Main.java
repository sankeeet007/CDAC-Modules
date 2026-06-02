package com.cdac;

import java.sql.*;

public class Main {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_db","batch163184","cdac");
            System.out.println("Connected to database successfully");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from users");
            while(rs.next()){
                System.out.println("ID: "+rs.getString(1));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Username: "+rs.getString("username"));
                System.out.println("Password: "+rs.getString(4));
                System.out.println("Email: "+rs.getString(5));
                System.out.println("City: "+rs.getString(6));
            }
        //} catch(ClassNotFoundException e) {
          //  e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(stmt != null)
                    stmt.close();
                if(rs != null)
                    rs.close();
            } catch (SQLException e) {}
        }
    }
}