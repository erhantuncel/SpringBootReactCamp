package springreact.day5.hw1.core.concretes;

import springreact.day5.hw1.core.abstracts.EmailConfirmationService;

public class EmailConfirmationManager implements EmailConfirmationService {

	@Override
	public void sendEmail(String email) {
		System.out.println("Doğrulama e-postası " + email + " adresine gönderildi.");
	}

	@Override
	public boolean verifyEmail(String email) {
		System.out.println("Email doğrulandı.");
		return true;
	}

}
