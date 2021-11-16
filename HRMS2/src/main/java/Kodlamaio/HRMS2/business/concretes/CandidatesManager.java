package Kodlamaio.HRMS2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS2.business.abstracts.CandidatesService;
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
	public List<Candidates> getall() {
		// TODO Auto-generated method stub
		return this.candidatesDao.findAll();
	}

	
	
}

	