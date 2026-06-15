package in.cdac.servlets;

import java.io.IOException;

import in.cdac.dao.CategoryDAO;
import in.cdac.dao.CategoryDAOImpl;
import in.cdac.entity.Category;
import in.cdac.exceptions.CategoryException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(initParams = { @WebInitParam(name = "driverClass", value = "com.mysql.cj.jdbc.Driver"),
		@WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost:3306/cdac"),
		@WebInitParam(name = "dbUser", value = "cdac"),
		@WebInitParam(name = "dbPassword", value = "cdac") }, urlPatterns = { "/CategoryRegister" })
public class CategoryRegister extends HttpServlet { // ✅ fixed class name
	private static final long serialVersionUID = 1L;

	CategoryDAO categoryDAO;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			categoryDAO = new CategoryDAOImpl(config); // ✅ initialized once in init()
		} catch (CategoryException e) {
			throw new ServletException("CategoryDAO init failed: " + e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || !"admin".equals(session.getAttribute("role"))) {
			response.sendRedirect("login.html");
			return;
		}

		String categoryName = request.getParameter("categoryName");
		String categoryDescription = request.getParameter("categoryDescription");
		String categoryImageUrl = request.getParameter("categoryImageUrl");

		Category objCategory = new Category();
		objCategory.setCategoryName(categoryName);
		objCategory.setCategoryDescription(categoryDescription);
		objCategory.setCategoryImageUrl(categoryImageUrl);

		boolean status = categoryDAO.addCategory(objCategory);

		if (status) {
			response.sendRedirect("AdminDashboard.html"); 
		} else {
			response.getWriter().println("Failed to add category.");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || !"admin".equals(session.getAttribute("role"))) {
			response.sendRedirect("login.html");
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher("CategoryRegistrationForm.html");
		rd.forward(request, response);
	}
}