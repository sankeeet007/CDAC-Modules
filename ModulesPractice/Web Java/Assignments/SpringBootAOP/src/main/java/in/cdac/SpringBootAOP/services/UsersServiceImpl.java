package in.cdac.SpringBootAOP.services;

import org.springframework.stereotype.Service;

import in.cdac.SpringBootAOP.entity.Users;

@Service
public class UsersServiceImpl implements UsersService{

	@Override
	public boolean authenticate(Users objUser) {
		if(objUser.getUserName().equals("sankeeet") && objUser.getPassword().equals("Sanket#1")) {
			return true;
		} else {			
			return false;
		}
	}

	@Override
	public Users createUsers(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
