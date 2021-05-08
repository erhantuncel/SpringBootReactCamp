package springreact.day5.hw1.core.abstracts;

public interface EmailConfirmationService {
	void sendEmail(String email);
	boolean verifyEmail(String email);
}
