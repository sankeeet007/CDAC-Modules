package in.cdac.servlets;

import java.io.IOException;

import in.cdac.dao.UsersDAO;
import in.cdac.dao.UsersDAOImpl;
import in.cdac.entity.Users;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(initParams = { @WebInitParam(name = "driverClass", value = "com.mysql.cj.jdbc.Driver"),
		@WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost:3306/cdac"),
		@WebInitParam(name = "dbUser", value = "cdac"),
		@WebInitParam(name = "dbPassword", value = "cdac") }, urlPatterns = { "/register" })

public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String city = request.getParameter("city");

		Users user = new Users();
		user.setUserName(userName);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		user.setCity(city);

		try {
			UsersDAO dao = new UsersDAOImpl(getServletConfig());
			boolean status = dao.registerUser(user);
			if (status) {
				response.sendRedirect("login.html");
			} else {
				response.getWriter().println("Registration Failed");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().println("Error : " + e.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationForm.html");
		rd.forward(request, response);
	}
}