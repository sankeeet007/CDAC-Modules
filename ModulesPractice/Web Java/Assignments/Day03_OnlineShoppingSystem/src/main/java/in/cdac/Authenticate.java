package in.cdac;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2_db", "batch163184", "cdac")) {
				PreparedStatement pstmt = connection.prepareStatement("select * from users where username=? and password=?");
				pstmt.setString(1, userName);
				pstmt.setString(2, password);
				try(ResultSet rSet = pstmt.executeQuery();) {
					
					if(rSet.next()) {
						out.println("Auth Successful");
					} else {
						response.sendRedirect("login.html");
					}
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
	}

}
