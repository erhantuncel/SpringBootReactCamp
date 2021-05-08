package springreact.day5.hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import springreact.day5.hw1.dataAccess.abstracts.UserDao;
import springreact.day5.hw1.entities.concretes.User;

public class HibernatesUserDao implements UserDao {

	private List<User> userList = new  ArrayList<User>();
	
	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println("Kullanıcı veritabanına eklendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		userList.add(user);
		System.out.println("Kullanıcı bilgisi güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		userList.remove(user);
		System.out.println("Kullanıcı veritabanından silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : userList) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

}
