package springreact.day5.hw1.dataAccess.abstracts;

import java.util.List;

import springreact.day5.hw1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User getByEmail(String email);
}
