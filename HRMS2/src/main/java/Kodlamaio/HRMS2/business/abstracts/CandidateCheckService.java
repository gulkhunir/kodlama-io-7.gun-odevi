package Kodlamaio.HRMS2.business.abstracts;

import Kodlamaio.HRMS2.entities.concretes.Candidates;

public interface CandidateCheckService {
	boolean CheckIfRealPerson(Candidates candidates);
}
