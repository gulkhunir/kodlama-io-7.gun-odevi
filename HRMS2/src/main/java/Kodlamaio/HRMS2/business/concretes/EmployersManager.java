package Kodlamaio.HRMS2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS2.business.abstracts.EmployersService;
import Kodlamaio.HRMS2.dataAccess.abstracts.EmployersDao;
import Kodlamaio.HRMS2.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{
	private EmployersDao employersDao;
		@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	@Override
	public List<Employers> getall() {
		return this.employersDao.findAll();
	}
}
