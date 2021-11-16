package Kodlamaio.HRMS2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.HRMS2.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
