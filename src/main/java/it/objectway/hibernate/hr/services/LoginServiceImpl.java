package it.objectway.hibernate.hr.services;

import it.objectway.hibernate.hr.dao.UsersDao;
import it.objectway.hibernate.hr.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

	private UsersDao usersDao;

	@Autowired
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	@Override
	public boolean getLogin(String username, String password) {
		try {
			System.out.println("Tentativo di login " + username);
			// TODO Auto-generated method stub
			Users user = usersDao.checkAuthentication(username, password);
			return user != null;
		} catch (DataAccessException ex) {
			return false;
		}
	}
}
