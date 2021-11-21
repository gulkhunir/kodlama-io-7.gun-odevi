package Kodlamaio.HRMS2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HRMS2.business.abstracts.EmployeesService;
import Kodlamaio.HRMS2.core.utility.result.DataResult;
import Kodlamaio.HRMS2.core.utility.result.Result;
import Kodlamaio.HRMS2.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	private EmployeesService employeesService;
	@Autowired
	public EmployeesController(EmployeesService employeesService) {
		super();
		this.employeesService = employeesService;
	}
	@RequestMapping("/getall")
	public DataResult<List<Employees>>getAll(){
		return this.employeesService.getall();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employees employees) {
		return this.employeesService.add(employees);
		
	}
	

}
