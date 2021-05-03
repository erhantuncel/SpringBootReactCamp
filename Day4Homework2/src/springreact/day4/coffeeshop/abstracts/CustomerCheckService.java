package springreact.day4.coffeeshop.abstracts;

import springreact.day4.coffeeshop.entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
