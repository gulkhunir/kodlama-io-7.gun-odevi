package Kodlamaio.HRMS2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS2.business.abstracts.CandidatesService;
import Kodlamaio.HRMS2.core.utility.result.DataResult;
import Kodlamaio.HRMS2.core.utility.result.Result;
import Kodlamaio.HRMS2.core.utility.result.SuccessDataResult;
import Kodlamaio.HRMS2.core.utility.result.SuccessResult;
import Kodlamaio.HRMS2.dataAccess.abstracts.CandidatesDao;
import Kodlamaio.HRMS2.entities.concretes.Candidates;


@Service
public class CandidatesManager implements CandidatesService{

	private CandidatesDao candidatesDao;
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}
	@Override
	public DataResult<List<Candidates>> getall() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(),"Data Listed..");
	}
	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Candidate added");
	}

	
	
}

	