package in.cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminDashboard")
public class AdminDashboard extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // ✅ Admin session check
        HttpSession session = request.getSession(false);
        if (session == null || !"admin".equals(session.getAttribute("role"))) {
            response.sendRedirect("login.html");
            return;
        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>Admin Dashboard</h3>");
        out.println("Welcome, <b>" + session.getAttribute("userName") + "</b>&nbsp;&nbsp;"); // ✅ fixed semicolon
        out.println("<a href='Logout'>Logout</a><br/><br/>");
        out.println("<hr/>");

        // ✅ Dropdown to navigate
        out.println("<form action='AdminDashboard' method='get'>");
        out.println("Select Action : ");
        out.println("<select name='action' onchange='this.form.submit()'>");
        out.println("<option value=''>-- Choose --</option>");
        out.println("<option value='addCategory'>Add Category</option>");
        out.println("<option value='addProduct'>Add Product</option>");
        out.println("<option value='deleteCategory'>Delete Category</option>");
        out.println("</select>");
        out.println("</form>");
        out.println("<br/>");

        // ✅ Show form based on selected action
        String action = request.getParameter("action");

        if ("addCategory".equals(action)) {
            out.println("<h4>Add Category</h4>");
            out.println("<form action='CategoryRegister' method='post'>"); // ✅ fixed action
            out.println("Category Name : <input type='text'   name='categoryName'/><br/><br/>");
            out.println("Description   : <input type='text'   name='categoryDescription'/><br/><br/>");
            out.println("Image URL     : <input type='text'   name='categoryImageUrl'/><br/><br/>");
            out.println("<input type='submit' value='Add Category'/>");
            out.println("</form>");

        } else if ("addProduct".equals(action)) {
            out.println("<h4>Add Product</h4>");
            out.println("<form action='ProductRegister' method='post'>"); // ✅ fixed action
            out.println("Category ID   : <input type='number'            name='categoryId'/><br/><br/>");
            out.println("Product Name  : <input type='text'              name='productName'/><br/><br/>");
            out.println("Description   : <input type='text'              name='productDescription'/><br/><br/>");
            out.println("Price         : <input type='number' step='0.01' name='productPrice'/><br/><br/>");
            out.println("Image URL     : <input type='text'              name='productImageUrl'/><br/><br/>");
            out.println("<input type='submit' value='Add Product'/>");
            out.println("</form>");

        } else if ("deleteCategory".equals(action)) {
            out.println("<h4>Delete Category</h4>");
            out.println("<form action='CategoryDelete' method='post'>"); // ✅ fixed action
            out.println("Category ID : <input type='number' name='categoryId'/><br/><br/>");
            out.println("<input type='submit' value='Delete Category'/>");
            out.println("</form>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}