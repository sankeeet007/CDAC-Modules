package in.cdac.dao;

import in.cdac.entity.Users;
import in.cdac.exceptions.CategoryException;

public interface UsersDAO {

    public boolean registerUser(Users objUser) throws CategoryException;

    public Users getUserDetails(String userName) throws CategoryException;

    public boolean removeUser(String userName) throws CategoryException;
}
