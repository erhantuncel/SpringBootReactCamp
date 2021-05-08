package springreact.day5.hw1.google;

public class GoogleAuthenticationApi {

	public void authenticate(String email, String password) {
		System.out.println("Google hesabı ile kullanıcı onaylandı.(Kullanıcı Adı: " 
							+ email + " Şifre: " + password + ")");
	}
}
