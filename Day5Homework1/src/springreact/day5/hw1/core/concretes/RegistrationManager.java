package springreact.day5.hw1.core.concretes;

import java.util.List;

import springreact.day5.hw1.business.abstracts.UserService;
import springreact.day5.hw1.core.abstracts.EmailConfirmationService;
import springreact.day5.hw1.core.abstracts.RegistrationService;
import springreact.day5.hw1.core.abstracts.ValidationService;
import springreact.day5.hw1.entities.concretes.User;

public class RegistrationManager implements RegistrationService {

	private UserService userService;
	private ValidationService validationService;
	private EmailConfirmationService emailConfirmationService;

	public RegistrationManager(UserService userService, ValidationService validationService,
			EmailConfirmationService emailConfirmationService) {
		this.userService = userService;
		this.validationService = validationService;
		this.emailConfirmationService = emailConfirmationService;
	}

	@Override
	public void register(User user) {
		List<String> validationMessages = validationService.validateForRegister(user);
		if (!validationMessages.isEmpty()) {
			for (String message : validationMessages) {
				System.out.println(message);
			}
			return;
		}
		if (isEmailInUse(user.getEmail())) {
			System.out.println(user.getEmail() + " e-posta adresi başka kullanıcı tarafından kullanılıyor.");
			return;
		}
		emailConfirmationService.sendEmail(user.getEmail());
		if (emailConfirmationService.verifyEmail(user.getEmail())) {
			userService.add(user);
		}
	}

	private boolean isEmailInUse(String email) {
		for (User user : this.userService.getAll()) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				return true;
			}
		}
		return false;
	}

}
