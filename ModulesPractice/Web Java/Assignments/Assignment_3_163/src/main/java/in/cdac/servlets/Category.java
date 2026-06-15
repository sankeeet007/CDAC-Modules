package in.cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import in.cdac.dao.CategoryDAO;
import in.cdac.dao.CategoryDAOImpl;
import in.cdac.exceptions.CategoryException;
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
		@WebInitParam(name = "dbPassword", value = "cdac") }, urlPatterns = { "/Category" })
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CategoryDAO categoryDAO;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			categoryDAO = new CategoryDAOImpl(config);
		} catch (CategoryException e) {
			throw new ServletException("CategoryDAO initialization failed : " + e.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null) {
			response.sendRedirect("login.html");
			return;
		}

		Iterator<in.cdac.entity.Category> iter = categoryDAO.getAllCategories();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href='Logout'>Logout</a><br/><br/>");
		out.println("Welcome, <b>" + session.getAttribute("userName") + "</b>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>Name</th>");
		out.println("<th>Description</th>");
		out.println("<th>Image</th>");
		out.println("</tr>");
		while (iter.hasNext()) {
			in.cdac.entity.Category objCategory = iter.next();
			out.println("<tr>");
			out.println("<td><a href='Products?categoryId=" + objCategory.getCategoryId() + "'>"
					+ objCategory.getCategoryName() + "</a></td>");
			out.println("<td>" + objCategory.getCategoryDescription() + "</td>");
			out.println("<td><img src='Images/" + objCategory.getCategoryImageUrl()
					+ "' height='80px' width='80px'/></td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}