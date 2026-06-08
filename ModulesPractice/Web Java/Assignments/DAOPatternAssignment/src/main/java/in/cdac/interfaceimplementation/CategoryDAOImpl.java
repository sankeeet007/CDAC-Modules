package in.cdac.interfaceimplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import in.cdac.entity.Category;
import in.cdac.interfaces.CategoryDAO;

public class CategoryDAOImpl implements CategoryDAO {
	Connection con;
	PreparedStatement pstmt;
	
	public CategoryDAOImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/batch2_db");
			pstmt = con.prepareStatement("select * from category");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Iterator<Category> getAllCategories() {
		ArrayList<Category> allCategories = new ArrayList<>();
		ResultSet rSet = pstmt.executeQuery();
		while(rSet.next()) {
			CategoryDAOImpl objCategory = new Category();
			objCategory.setCategory();
			
		}
		return null;
	}

}
