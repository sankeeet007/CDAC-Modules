package in.cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import in.cdac.cart.Cart;
import in.cdac.entity.Products;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ListCart")
public class ListCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.html");
            return;
        }

        Cart objCart = (Cart) session.getAttribute("cart");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Welcome " + session.getAttribute("userName") + "<br/>");
        out.println("<a href='Logout'>Logout</a>");

        if (objCart == null) {
            out.println("Cart is empty");
        } else {
            out.println("<table border='1'>");
            double total = 0.0;
            Iterator<Products> iter = objCart.listCart();
            while (iter.hasNext()) {
                Products objProduct = iter.next();
                out.println("<tr>");
                out.println("<td>" + objProduct.getCategoryId() + "</td>");
                out.println("<td>" + objProduct.getProductId() + "</td>");
                out.println("<td>" + objProduct.getProductPrice() + "</td>");
                out.println("</tr>");
                total += objProduct.getProductPrice();
            }
            out.println("</table>");
            out.println("<h3>Total : " + total + "</h3><br/>");
            out.println("<a href='Payment'>CheckOut</a>");
            out.println("<a href='Category'>Continue Shopping</a>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}