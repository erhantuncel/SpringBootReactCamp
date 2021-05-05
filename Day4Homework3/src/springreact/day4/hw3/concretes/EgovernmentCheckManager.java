package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.UserCheckService;
import springreact.day4.hw3.entities.User;

public class EgovernmentCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		if(user.getFirstName().equals("Ahmet") && 
			user.getLastName().equals("OYUNCU") &&
			user.getDateOfBirth().getYear() == 1984 &&
			user.getNationalityId().equals("12345678910")) {
			return true;
		}
		return false;
	}

}
