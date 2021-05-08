package springreact.day5.hw1.core.abstracts;

import java.util.List;

import springreact.day5.hw1.entities.concretes.User;

public interface ValidationService {
	List<String> validateForRegister(User user);
}
