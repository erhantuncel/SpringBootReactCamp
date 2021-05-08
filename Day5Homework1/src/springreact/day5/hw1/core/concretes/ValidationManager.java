package springreact.day5.hw1.core.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import springreact.day5.hw1.core.abstracts.ValidationService;
import springreact.day5.hw1.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public List<String> validateForRegister(User user) {
		List<String> validationMessages = new ArrayList<String>();
		if (!validateForCharacterLength(user.getFirstName(), 2)) {
			validationMessages.add("Ad en az 2 karakter olmalı.");
		}
		if (!validateForCharacterLength(user.getLastName(), 2)) {
			validationMessages.add("Soyad en az 2 karakter olmalı.");
		}
		if (!validateForCharacterLength(user.getPassword(), 5)) {
			validationMessages.add("Şifre en az 6 karakter olmalı.");
		}
		if (!validateEmail(user.getEmail())) {
			validationMessages.add("Geçerli bir e-posta adresi girmelisiniz.");
		}
		return validationMessages;
	}

	private boolean validateForCharacterLength(String validateFor, int lenght) {
		if (!validateFor.isEmpty() && (validateFor.length() > lenght)) {
			return true;
		}
		return false;
	}

	private boolean validateEmail(String email) {
		if (!email.isEmpty()) {
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		return false;
	}

}
