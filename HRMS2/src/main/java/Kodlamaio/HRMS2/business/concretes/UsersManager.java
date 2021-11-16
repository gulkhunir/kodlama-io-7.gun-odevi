package Kodlamaio.HRMS2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS2.business.abstracts.UsersService;
import Kodlamaio.HRMS2.dataAccess.abstracts.UsersDao;
import Kodlamaio.HRMS2.entities.concretes.Users;

@Service
public class UsersManager implements UsersService{
	private UsersDao usersDao;
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}
	@Override
	public List<Users> getall() {
		return this.usersDao.findAll();
	}
}
