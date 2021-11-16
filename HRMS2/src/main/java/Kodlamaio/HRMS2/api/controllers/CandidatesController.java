package Kodlamaio.HRMS2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HRMS2.business.abstracts.CandidatesService;
import Kodlamaio.HRMS2.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	private CandidatesService candidatesService;
	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	@RequestMapping("/getall")
	List<Candidates>getAll(){
		return this.candidatesService.getall();
	}
}
