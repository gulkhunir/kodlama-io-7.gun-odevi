package Kodlamaio.HRMS2.core.utility.adapters.abstracts;

import Kodlamaio.HRMS2.entities.concretes.Users;

public interface EmailVerificationService {
	boolean verify(Users users);
}
