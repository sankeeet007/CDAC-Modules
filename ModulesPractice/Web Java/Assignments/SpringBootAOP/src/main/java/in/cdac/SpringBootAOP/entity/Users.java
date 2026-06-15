package in.cdac.SpringBootAOP.entity;

import org.springframework.stereotype.Component;

@Component
public class Users {

	String userName = "sankeeet";

	String password = "Sanket#1";

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + "]";
	}

}
