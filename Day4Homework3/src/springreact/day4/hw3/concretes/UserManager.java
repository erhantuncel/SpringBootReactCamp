package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.Logger;
import springreact.day4.hw3.abstracts.UserService;
import springreact.day4.hw3.entities.User;

public class UserManager implements UserService {

	EgovernmentCheckManager userCheckManager;
	Logger logger;

	public UserManager(EgovernmentCheckManager userCheckManager, Logger logger) {
		this.userCheckManager = userCheckManager;
		this.logger = logger;
	}

	@Override
	public void add(User user) {
		if (userCheckManager.checkIfRealPerson(user)) {
			logger.log("User is added: " + user.getFirstName());
		} else {
			logger.log("User could NOT be added: " + user.getFirstName() + " - Not a valid user.");
		}
	}

	@Override
	public void update(User user) {
		if (userCheckManager.checkIfRealPerson(user)) {
			logger.log("User information is updated: " + user.getFirstName());
		} else {
			logger.log("User information could NOT be updated: " + user.getFirstName() + " - Not a valid user.");
		}
	}

	@Override
	public void delete(User user) {
		logger.log("User is removed: " + user.getFirstName());
	}

}
