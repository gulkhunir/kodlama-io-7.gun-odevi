package Kodlamaio.HRMS2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HRMS2.business.abstracts.EmployersService;
import Kodlamaio.HRMS2.core.utility.result.DataResult;
import Kodlamaio.HRMS2.core.utility.result.Result;
import Kodlamaio.HRMS2.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployersService employersService;
	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	@RequestMapping("/getall")
	public DataResult<List<Employers>>getAll()
	{
		return this.employersService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		return this.employersService.add(employers);
	}
	
}
