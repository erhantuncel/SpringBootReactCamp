package springreact.day5.hw1;

import springreact.day5.hw1.business.abstracts.UserService;
import springreact.day5.hw1.business.concretes.UserManager;
import springreact.day5.hw1.core.abstracts.AuthenticationService;
import springreact.day5.hw1.core.abstracts.RegistrationService;
import springreact.day5.hw1.core.concretes.EmailConfirmationManager;
import springreact.day5.hw1.core.concretes.GoogleAuthenticationApiAdapter;
import springreact.day5.hw1.core.concretes.AuthenticationManager;
import springreact.day5.hw1.core.concretes.RegistrationManager;
import springreact.day5.hw1.core.concretes.ValidationManager;
import springreact.day5.hw1.dataAccess.abstracts.UserDao;
import springreact.day5.hw1.dataAccess.concretes.HibernatesUserDao;
import springreact.day5.hw1.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\n---- KULLANICI KAYIT İŞLEMLERİ ----");
		
		UserDao userDao = new HibernatesUserDao();
		UserService userManager = new UserManager(userDao);
		RegistrationService registrationManager = new RegistrationManager(userManager, 
				new ValidationManager(), new EmailConfirmationManager());
		
		User userInvalidFirstName = new User(1, "A", "ÇALIŞKAN", "ahmet@abc.com", "123456");
		System.out.println(userInvalidFirstName);
		registrationManager.register(userInvalidFirstName);
		
		
		System.out.println("\n-----------------------------------");
		User userInvalidLastName = new User(1, "Ahmet", "Ç", "ahmet@abc.com", "123456");
		System.out.println(userInvalidLastName);
		registrationManager.register(userInvalidLastName);
		
		System.out.println("\n-----------------------------------");
		User userInvalidEmail = new User(1, "Ahmet", "ÇALIŞKAN", "ahmetabc.com", "123456");
		System.out.println(userInvalidEmail);
		registrationManager.register(userInvalidEmail);
		
		System.out.println("\n-----------------------------------");
		User userInvalidPassword = new User(1, "Ahmet", "ÇALIŞKAN", "ahmetabc.com", "1456");
		System.out.println(userInvalidPassword);
		registrationManager.register(userInvalidPassword);
		
		System.out.println("\n-----------------------------------");
		User validUser1 = new User(1, "Ahmet", "ÇALIŞKAN", "ahmet@abc.com", "123456");
		System.out.println(validUser1);
		registrationManager.register(validUser1);
		
		System.out.println("\n-----------------------------------");
		User validUser2EmailInUse = new User(2, "Mehmet", "YILMAZ", "ahmet@abc.com", "376256");
		System.out.println(validUser2EmailInUse);
		registrationManager.register(validUser2EmailInUse);
		
		RegistrationManager googleRegistrationManager = new RegistrationManager(userManager, new GoogleAuthenticationApiAdapter(), new EmailConfirmationManager());
		System.out.println("\n-----------------------------------");
		User validUser3Google = new User(3, "Mehmet", "YILMAZ", "mehmet@abc.com", "376256");
		System.out.println(validUser2EmailInUse);
		googleRegistrationManager.register(validUser3Google);
		
		
		System.out.println("\n---- KULLANICI GİRİŞ İŞLEMLERİ ----");
		AuthenticationService authenticationManager = new AuthenticationManager(userManager);
		
		System.out.println("Kullanıcı adı:  Şifre: bilgileri ile giriş yapılıyor.");
		authenticationManager.login("", "");
		
		System.out.println("\n-----------------------------------");
		System.out.println("Kullanıcı adı: ahme@abc.com Şifre: 272726 bilgileri ile giriş yapılıyor.");
		authenticationManager.login("ahme@abc.com", "272726");
		
		System.out.println("\n-----------------------------------");
		System.out.println("Kullanıcı adı: ahmet@abc.com Şifre: 123456 bilgileri ile giriş yapılıyor.");
		authenticationManager.login("ahmet@abc.com", "121456");
		
		System.out.println("\n-----------------------------------");
		System.out.println("Kullanıcı adı: ahmet@abc.com Şifre: 123456 bilgileri ile giriş yapılıyor.");
		authenticationManager.login("ahmet@abc.com", "123456");
		
	}
}
