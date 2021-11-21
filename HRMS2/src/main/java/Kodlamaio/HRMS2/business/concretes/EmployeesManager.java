package Kodlamaio.HRMS2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS2.business.abstracts.EmployeesService;
import Kodlamaio.HRMS2.core.utility.result.DataResult;
import Kodlamaio.HRMS2.core.utility.result.Result;
import Kodlamaio.HRMS2.core.utility.result.SuccessDataResult;
import Kodlamaio.HRMS2.core.utility.result.SuccessResult;
import Kodlamaio.HRMS2.dataAccess.abstracts.EmployeeDao;
import Kodlamaio.HRMS2.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService{
	private EmployeeDao employeeDao;
	@Autowired
	public EmployeesManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	@Override
	public DataResult<List<Employees>> getall() {
		return new SuccessDataResult<List<Employees>>(employeeDao.findAll(),"Data Listed");
	}
	@Override
	public Result add(Employees employees) {
		this.employeeDao.save(employees);
		return new SuccessResult("Employee added");
	}
}
