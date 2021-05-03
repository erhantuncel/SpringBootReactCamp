package springreact.day4.coffeeshop.abstracts;

import springreact.day4.coffeeshop.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
