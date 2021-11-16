package Kodlamaio.HRMS2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HRMS2.business.abstracts.UsersService;
import Kodlamaio.HRMS2.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UsersService usersService;
	@Autowired
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	@RequestMapping("/getall")
	List<Users> getAll(){
		return this.usersService.getall();
	}
}
