package in.cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Products")                
public class Product extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.html");
            return;
        }

        PrintWriter out = response.getWriter();

        String tmp = request.getParameter("categoryId");
        int categoryId = Integer.parseInt(tmp);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/cdac", "cdac", "cdac");
                 PreparedStatement psProducts = connection.prepareStatement(
                        "SELECT * FROM products WHERE categoryId = ?")) {

                psProducts.setInt(1, categoryId);

                try (ResultSet result = psProducts.executeQuery()) {

                    out.println("<html>");
                    out.println("<body>");
                    out.println("Welcome <b>" + session.getAttribute("userName") + "</b><br/>");
                    out.println("<a href='Logout'>Logout</a>&nbsp;&nbsp;");
                    out.println("<a href='Category'>Back</a><br/><br/>");
                    out.println("<table border='1'>");
                    out.println("<tr>");
                    out.println("<th>Name</th>");
                    out.println("<th>Description</th>");
                    out.println("<th>Price</th>");
                    out.println("<th>Action</th>");
                    out.println("</tr>");

                    while (result.next()) {
                        out.println("<tr>");
                        out.println("<td>" + result.getString("productName") + "</td>");
                        out.println("<td>" + result.getString("productDescription") + "</td>");
                        out.println("<td>" + result.getString("productPrice") + "</td>");
                        out.println("<td><a href='AddCart?categoryId=" + categoryId
                                + "&productId=" + result.getInt("productId")
                                + "&price=" + result.getDouble("productPrice")
                                + "'>Add to Cart</a></td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    out.println("</body>");
                    out.println("</html>");
                }

            } catch (SQLException e) {
                out.println("Database error: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}