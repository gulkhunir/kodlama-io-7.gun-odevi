package Kodlamaio.HRMS2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.HRMS2.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

}
