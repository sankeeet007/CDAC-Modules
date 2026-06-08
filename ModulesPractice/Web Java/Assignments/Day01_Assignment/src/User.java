import java.sql.*;
import java.util.Scanner;

<<<<<<< HEAD:ModulesPractice/Web Java/Assignments/Day01_Assignment/src/User.java
public class User {
    public static void registerUser(Scanner sc, Connection con) throws SQLException{
        System.out.println("Enter Name: ");
=======
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/assignment1";
        String user = "root";
        String pass = "root";
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                Scanner sc = new Scanner(System.in);
        ){
            int choice;
            do{
                System.out.println("************* JDBC **************");
                System.out.println("1. Register a User\n" +
                                 "2. List All Users based on City\n" +
                                 "3. Update Password of a User\n" +
                                 "4. Display user information based on User Name\n" +
                                 "5. Exit");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                switch(choice){
                    case 1: registerUser(conn, sc);
                            break;
                    case 2: listByCity(conn, sc);
                        break;
                    case 3: updatePassword(conn, sc);
                        break;
                    case 4: displayUserByUsername(conn, sc);
                        break;
                    case 5: System.out.println("Exit...");
                        break;
                    default: System.out.println("Invalid Choice!!! Enter valid input...");
                            break;
                }
            }while(choice!=5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayUserByUsername(Connection conn, Scanner sc) {
        System.out.println("Enter username: ");
>>>>>>> fe2f32e2b88f496576e7585e3ad97fbb694048d8:ModulesPractice/Web Java/Assignments/Day01_Assignment/src/Main.java
        String name = sc.next();
        String Query = "Select * from users where name=?";
        try(PreparedStatement pstmt = conn.prepareStatement(Query)){

<<<<<<< HEAD:ModulesPractice/Web Java/Assignments/Day01_Assignment/src/User.java
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
=======
            pstmt.setString(1, name);

            try(ResultSet rs = pstmt.executeQuery(); ){
                if(rs.next()) {

                    while (rs.next()) {
                        System.out.println(rs.getString("name"));
                        System.out.println(rs.getString("username"));
                        System.out.println(rs.getString("password"));
                        System.out.println(rs.getString("email"));
                        System.out.println(rs.getString("city"));
                    }
                } else {
                    System.out.println("Username Not Found!");
>>>>>>> fe2f32e2b88f496576e7585e3ad97fbb694048d8:ModulesPractice/Web Java/Assignments/Day01_Assignment/src/Main.java
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updatePassword(Connection conn, Scanner sc) {
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter new Password: ");
        String newPassword = sc.next();
        String Query = "UPDATE users SET password=?  WHERE name=?";
        try(PreparedStatement pstmt = conn.prepareStatement(Query)) {
            pstmt.setString(1, newPassword);
            pstmt.setString(2, username);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Password Updated Successfully.");
            } else {
                System.out.println("User not found. No changes made. ");
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
    }

    private static void listByCity(Connection conn, Scanner sc) {
        System.out.println("Enter city");
        String city = sc.next();
        String Query = "select * from users where city=?";
        try(PreparedStatement pstmt = conn.prepareStatement(Query)){
            pstmt.setString(1, city);
            try(ResultSet rs = pstmt.executeQuery();) {
                if(rs.next()) {


                    while (rs.next()) {

                        System.out.println(rs.getString("name"));
                        System.out.println(rs.getString("username"));
                        System.out.println(rs.getString("password"));
                        System.out.println(rs.getString("email"));
                        System.out.println(rs.getString("city"));
                    }
                } else {
                    System.out.println("No user from "+city+ ".");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void registerUser(Connection conn, Scanner sc) {
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter username: ");
        String userName = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();

        String query = "insert into users values(?,?,?,?,?);";
        try(PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, name);
            pstmt.setString(2, userName);
            pstmt.setString(3, password);
            pstmt.setString(4, email);
            pstmt.setString(5, city);


            pstmt.executeUpdate();
            System.out.println("Saved User details Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}