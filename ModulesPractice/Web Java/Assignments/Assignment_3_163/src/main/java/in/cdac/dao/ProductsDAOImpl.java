package in.cdac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.cdac.entity.Products;
import in.cdac.exceptions.CategoryException;
import in.cdac.exceptions.ProductException;
import jakarta.servlet.ServletConfig;

public class ProductsDAOImpl implements ProductsDAO {

	Connection connection;
	PreparedStatement psAddProduct;
	PreparedStatement psGetProduct;
	PreparedStatement psUpdateProduct;
	PreparedStatement psDeleteProduct;

	public ProductsDAOImpl(ServletConfig config) throws ProductException {
		try {
			String driver = config.getInitParameter("driverClass");
			String url = config.getInitParameter("dbUrl");
			String dbUser = config.getInitParameter("dbUser");
			String dbPass = config.getInitParameter("dbPassword");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, dbUser, dbPass);
			psAddProduct = connection.prepareStatement(
					"INSERT INTO products (categoryId, productId, productName, productDescription, productPrice) "
							+ "VALUES (?, ?, ?, ?)");

			psGetProduct = connection.prepareStatement("SELECT * FROM products WHERE product_id = ?");
			psDeleteProduct = connection.prepareStatement("DELETE FROM products WHERE product_id = ?");
		} catch (Exception e) {
			throw new ProductException("Initialization failed : " + e.getMessage());
		}
	}

	@Override
	public boolean addProduct(Products objProduct) throws ProductException {
		try {
			psAddProduct.clearParameters();
			psAddProduct.setInt(1, objProduct.getCategoryId());
			psAddProduct.setString(2, objProduct.getProductName());
			psAddProduct.setString(3, objProduct.getProductDescription());
			psAddProduct.setDouble(4, objProduct.getProductPrice());
			psAddProduct.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new ProductException("Failed to add product: " + e.getMessage());
		}
	}

	@Override
	public Products getProductDetails(int productId) throws ProductException {
		try {
			psGetProduct.clearParameters();
			psGetProduct.setInt(1, productId);
			try (ResultSet result = psGetProduct.executeQuery()) {
				if (result.next()) {
					Products objProduct = new Products();
					objProduct.setProductId(result.getInt("product_id"));
					objProduct.setCategoryId(result.getInt("category_id"));
					objProduct.setProductName(result.getString("product_name"));
					objProduct.setProductDescription(result.getString("product_description"));
					objProduct.setProductPrice(result.getDouble("product_price"));
					return objProduct;
				}
			}
		} catch (SQLException e) {
			throw new ProductException("Error fetching product: " + e.getMessage());
		}
		return null;
	}

	@Override
	public boolean deleteProduct(int productId) throws ProductException {
		try {
			psDeleteProduct.clearParameters();
			psDeleteProduct.setInt(1, productId);
			int rows = psDeleteProduct.executeUpdate();
			return rows > 0;
		} catch (SQLException e) {
			throw new ProductException("Failed to delete product: " + e.getMessage());
		}
	}
}