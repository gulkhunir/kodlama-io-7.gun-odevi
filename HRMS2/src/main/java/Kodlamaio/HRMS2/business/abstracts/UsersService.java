package Kodlamaio.HRMS2.business.abstracts;

import java.util.List;

import Kodlamaio.HRMS2.core.utility.result.DataResult;
import Kodlamaio.HRMS2.core.utility.result.Result;
import Kodlamaio.HRMS2.entities.concretes.Users;

public interface UsersService {

	DataResult<List<Users>>getall();
	Result add(Users users);
}
