package springreact.day5.hw1.core.concretes;

import springreact.day5.hw1.business.abstracts.UserService;
import springreact.day5.hw1.core.abstracts.AuthenticationService;

public class AuthenticationManager implements AuthenticationService {

	UserService userService;

	public AuthenticationManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("E-posta ve şifre zorunludur.");
			return;
		}
		if(this.userService.getByEmail(email) == null) {
			System.out.println("Bu e-posta adresi ile kayıtlı kullanıcı bulunamadı.");
			return;
		} 
		if(!this.userService.getByEmail(email).getPassword().equals(password)) {				
			System.out.println("Şifre hatalı.");
		} else {			
			System.out.println("Kullanıcı girişi başarılı.");
		}
 	}

}
