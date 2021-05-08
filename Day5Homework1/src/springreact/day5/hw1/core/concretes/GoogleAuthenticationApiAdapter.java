package springreact.day5.hw1.core.concretes;

import java.util.ArrayList;
import java.util.List;

import springreact.day5.hw1.core.abstracts.ValidationService;
import springreact.day5.hw1.entities.concretes.User;
import springreact.day5.hw1.google.GoogleAuthenticationApi;

public class GoogleAuthenticationApiAdapter implements ValidationService {

	@Override
	public List<String> validateForRegister(User user) {
		GoogleAuthenticationApi googleManager = new GoogleAuthenticationApi();
		googleManager.authenticate(user.getEmail(), user.getPassword());
		return new ArrayList<String>();
	}

}
