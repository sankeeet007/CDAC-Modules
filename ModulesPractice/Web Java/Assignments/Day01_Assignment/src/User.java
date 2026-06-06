import java.sql.*;
import java.util.Scanner;

public class User {
    public static void registerUser(Scanner sc, Connection con) throws SQLException{
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
        String query="Insert into users values(?,?,?,?,?)";
        try(PreparedStatement st=con.prepareStatement(query)){
            st.setString(1,name);
            st.setString(2,userName);
            st.setString(3,password);
            st.setString(4,email);
            st.setString(5,city);
            st.executeUpdate();
            System.out.println("User registered successfully!");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void listUsers(Scanner sc, Connection con) throws SQLException{
        System.out.println("Enter City: ");
        String city = sc.next();
        String query="Select * from users where city=?";
        try(PreparedStatement st=con.prepareStatement(query)){
            st.setString(1,city);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePassword(Scanner sc, Connection con) throws SQLException{
        System.out.println("Enter Username: ");
        String userName = sc.next();
        System.out.println("Enter New Password: ");
        String password = sc.next();
        String query="Update users Set password=? where username=?";
        try(PreparedStatement st=con.prepareStatement(query)){
            st.setString(1,password);
            st.setString(2, userName);
            int rs = st.executeUpdate();
            if(rs!=0){
                System.out.println("Password updated successfully!");
            }
            else
                System.out.println("Error");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayUser(Scanner sc, Connection con) throws SQLException{
        System.out.println("Enter Username: ");
        String userName = sc.next();
        String query="Select * from users where username=?";
        try(PreparedStatement st=con.prepareStatement(query)){
            st.setString(1,userName);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                System.out.println("Name: "+rs.getString(1)+
                        "\nEmail: "+rs.getString(4)+
                        "\nCity: "+rs.getString(5));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_db", "batch163184", "cdac");
        Scanner sc = new Scanner(System.in);
        int choice;


        do{
            System.out.print("\n1. Register a User\n" +
                    "2. List All Users based on City\n" +
                    "3. Update Password of a User\n" +
                    "4. Display user information based on User Name\n ");
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
            switch (choice){
                case 1: {
                    registerUser(sc,con);
                    break;
                }
                case 2: {
                    listUsers(sc, con);
                    break;
                }
                case 3: {
                    updatePassword(sc, con);
                    break;
                }
                case 4: {
                    displayUser(sc, con);
                    break;
                }
                default: {
                    System.out.println("Entered wrong choice...");
                    break;
                }
            }
        }while(choice != 5);
    }
}