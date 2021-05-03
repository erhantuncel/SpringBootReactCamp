package springreact.day4.coffeeshop.concrete;

import springreact.day4.coffeeshop.abstracts.CustomerCheckService;
import springreact.day4.coffeeshop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
