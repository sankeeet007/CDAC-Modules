package in.cdac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.cdac.entity.Users;
import in.cdac.exceptions.CategoryException;
import jakarta.servlet.ServletConfig;

public class UsersDAOImpl implements UsersDAO {

	Connection connection;
	PreparedStatement psRegisterUser;
	PreparedStatement psUserDetails;
	PreparedStatement psRemoveUser;

	public UsersDAOImpl(ServletConfig config) throws CategoryException {
		try {
			String driver = config.getInitParameter("driverClass");
			String url = config.getInitParameter("dbUrl");
			String dbUser = config.getInitParameter("dbUser");
			String dbPass = config.getInitParameter("dbPassword");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, dbUser, dbPass);

			psRegisterUser = connection.prepareStatement(
					"INSERT INTO users (username, password, name, email, city) " + "VALUES (?, ?, ?, ?, ?)");
			psUserDetails = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
			psRemoveUser = connection.prepareStatement("DELETE FROM users WHERE username = ?");
		} catch (Exception e) {
			throw new CategoryException("Initialization failed : " + e.getMessage());
		}
	}

	@Override
	public boolean registerUser(Users objUser) throws CategoryException {
		try {
			psRegisterUser.clearParameters();
			psRegisterUser.setString(1, objUser.getUserName());
			psRegisterUser.setString(2, objUser.getPassword());
			psRegisterUser.setString(3, objUser.getName());
			psRegisterUser.setString(4, objUser.getEmail());
			psRegisterUser.setString(5, objUser.getCity());
			psRegisterUser.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new CategoryException("Failed to register user : " + e.getMessage());
		}
	}

	@Override
	public Users getUserDetails(String userName) throws CategoryException {
		try {
			psUserDetails.clearParameters();
			psUserDetails.setString(1, userName);
			try (ResultSet result = psUserDetails.executeQuery()) {
				if (result.next()) {
					Users objUser = new Users();
					objUser.setUserName(result.getString("username"));
					objUser.setPassword(result.getString("password"));
					objUser.setName(result.getString("name"));
					objUser.setEmail(result.getString("email"));
					objUser.setCity(result.getString("city"));
					return objUser;
				}
			}
		} catch (SQLException e) {
			throw new CategoryException("Error fetching user : " + e.getMessage());
		}
		return null;
	}

	@Override
	public boolean removeUser(String userName) throws CategoryException {
		try {
			psRemoveUser.clearParameters();
			psRemoveUser.setString(1, userName);
			int rows = psRemoveUser.executeUpdate();
			return rows > 0;
		} catch (SQLException e) {
			throw new CategoryException("Failed to remove user : " + e.getMessage());
		}
	}
}