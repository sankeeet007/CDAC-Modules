package in.cdac.servlets;

import java.io.IOException;

import in.cdac.cart.Cart;
import in.cdac.cart.ShoppingCart;
import in.cdac.entity.Products;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(initParams = {
    @WebInitParam(name = "driverClass", value = "com.mysql.cj.jdbc.Driver"),
    @WebInitParam(name = "dbUrl",       value = "jdbc:mysql://localhost:3306/cdac"),
    @WebInitParam(name = "dbUser",      value = "cdac"),
    @WebInitParam(name = "dbPassword",  value = "cdac")
}, urlPatterns = {"/AddCart"})
public class AddCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.html");
            return;
        }

        String tmp = request.getParameter("categoryId");
        int categoryId = Integer.parseInt(tmp);

        tmp = request.getParameter("productId");
        int productId = Integer.parseInt(tmp);

        tmp = request.getParameter("price");
        float price = Float.parseFloat(tmp);

        Products objProduct = new Products();
        objProduct.setCategoryId(categoryId);
        objProduct.setProductId(productId);
        objProduct.setProductPrice(price); 

        Cart objCart = (Cart) session.getAttribute("cart");
        if (objCart == null) {
            objCart = new ShoppingCart();
            session.setAttribute("cart", objCart);
        }

        objCart.addToCart(objProduct);

        response.sendRedirect("ListCart");
    }
}