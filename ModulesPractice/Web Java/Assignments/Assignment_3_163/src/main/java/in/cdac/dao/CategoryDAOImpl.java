package in.cdac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import in.cdac.entity.Category;
import in.cdac.exceptions.CategoryException;
import jakarta.servlet.ServletConfig;

public class CategoryDAOImpl implements CategoryDAO {

    Connection connection;
    PreparedStatement psAllCategories;
    PreparedStatement psAddCategory;
    PreparedStatement psDeleteCategory;

    public CategoryDAOImpl(ServletConfig config) throws CategoryException {
        try {
            String driver = config.getInitParameter("driverClass");
            String url    = config.getInitParameter("dbUrl");
            String dbUser = config.getInitParameter("dbUser");
            String dbPass = config.getInitParameter("dbPassword");

            Class.forName(driver);
            connection = DriverManager.getConnection(url, dbUser, dbPass);

            psAllCategories = connection.prepareStatement(
                "SELECT * FROM category");

            psAddCategory = connection.prepareStatement(
                "INSERT INTO category (category_name, category_description, category_image_url) " +
                "VALUES (?, ?, ?)");

            psDeleteCategory = connection.prepareStatement(
                "DELETE FROM category WHERE category_id = ?");

        } catch (Exception e) {
            throw new CategoryException("Initialization failed : " + e.getMessage());
        }
    }

    @Override
    public Iterator<Category> getAllCategories() {
        try {
            ArrayList<Category> allCategories = new ArrayList<>();

            ResultSet result = psAllCategories.executeQuery();
            while (result.next()) {
                Category objCategory = new Category();
                objCategory.setCategoryId(result.getInt(1));
                objCategory.setCategoryName(result.getString(2));
                objCategory.setCategoryDescription(result.getString(3));
                objCategory.setCategoryImageUrl(result.getString(4));
                allCategories.add(objCategory);
            }

            return allCategories.iterator();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NullPointerException("Unable to fetch data");
        }
    }

    @Override
    public boolean addCategory(Category category) {
        try {
            psAddCategory.clearParameters();
            psAddCategory.setString(1, category.getCategoryName());
            psAddCategory.setString(2, category.getCategoryDescription());
            psAddCategory.setString(3, category.getCategoryImageUrl());
            psAddCategory.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCategory(int categoryId) {
        try {
            psDeleteCategory.clearParameters();
            psDeleteCategory.setInt(1, categoryId);
            int rows = psDeleteCategory.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}