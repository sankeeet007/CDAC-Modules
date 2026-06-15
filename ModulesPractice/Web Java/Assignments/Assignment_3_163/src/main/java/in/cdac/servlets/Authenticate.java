package in.cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(initParams = { @WebInitParam(name = "driverClass", value = "com.mysql.cj.jdbc.Driver"),
		@WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost/cdac"),
		@WebInitParam(name = "dbUser", value = "cdac"),
		@WebInitParam(name = "dbPassword", value = "cdac") }, urlPatterns = { "/Authenticate" })
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String dbUrl;
	private String dbUser;
	private String dbPassword;
	private String driverClass;

	@Override
	public void init() throws ServletException {
		driverClass = getInitParameter("driverClass");
		dbUrl = getInitParameter("dbUrl");
		dbUser = getInitParameter("dbUser");
		dbPassword = getInitParameter("dbPassword");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		String table = "admin".equals(role) ? "admin" : "users";
		String query = "SELECT * FROM " + table + " WHERE userName = ? AND password = ?";

		try {
			Class.forName(driverClass);

			try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
					PreparedStatement psAuthenticate = connection.prepareStatement(query)) {

				psAuthenticate.setString(1, userName);
				psAuthenticate.setString(2, password);

				try (ResultSet result = psAuthenticate.executeQuery()) {
					if (result.next()) {
						HttpSession session = request.getSession(true);
						session.setAttribute("userName", userName);
						session.setAttribute("role", role);

						if ("admin".equals(role)) {
							response.sendRedirect("AdminDashboard.html");
						} else {
							response.sendRedirect("Category");
						}
					} else {
						response.sendRedirect("login.html");
					}
				}

			} catch (SQLException e) {
				out.println("We seem to have run into an issue, our team is already sleeping over it");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}