package in.cdac.servlets;

import java.io.IOException;

import in.cdac.dao.ProductsDAO;
import in.cdac.dao.ProductsDAOImpl;
import in.cdac.entity.Products;
import in.cdac.exceptions.ProductException;
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
		@WebInitParam(name = "dbPassword", value = "cdac") }, urlPatterns = { "/ProductRegister" })
public class ProductRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductsDAO productsDAO;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			productsDAO = new ProductsDAOImpl(config); // ✅ initialized once
		} catch (ProductException e) {
			throw new ServletException("ProductsDAO init failed: " + e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || !"admin".equals(session.getAttribute("role"))) {
			response.sendRedirect("login.html");
			return;
		}

		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		int productId =Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		double productPrice = Double.parseDouble(request.getParameter("productPrice"));
	

		Products objProduct = new Products();
		objProduct.setCategoryId(categoryId);
		objProduct.setCategoryId(productId);
		objProduct.setProductName(productName);
		objProduct.setProductDescription(productDescription);
		objProduct.setProductPrice(productPrice);
	 // ✅ make sure setter exists

		try {
			boolean status = productsDAO.addProduct(objProduct);

			if (status) {
				response.sendRedirect("AdminDashboard.html"); // ✅ success
			} else {
				response.getWriter().println("Failed to add product.");
			}

		} catch (ProductException e) {
			e.printStackTrace();
			response.getWriter().println("Error : " + e.getMessage());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || !"admin".equals(session.getAttribute("role"))) {
			response.sendRedirect("login.html");
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher("ProductRegistrationForm.html");
		rd.forward(request, response);
	}
}