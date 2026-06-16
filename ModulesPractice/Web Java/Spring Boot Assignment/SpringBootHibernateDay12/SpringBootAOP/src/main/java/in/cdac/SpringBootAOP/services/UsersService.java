package in.cdac.SpringBootAOP.services;

import in.cdac.SpringBootAOP.entity.Users;

public interface UsersService {
	public boolean authenticate(Users objUser);
	public Users createUsers(String username, String password);
	
}
