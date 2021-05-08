package springreact.day5.hw1.business.concretes;

import java.util.List;

import springreact.day5.hw1.business.abstracts.UserService;
import springreact.day5.hw1.dataAccess.abstracts.UserDao;
import springreact.day5.hw1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}
}
