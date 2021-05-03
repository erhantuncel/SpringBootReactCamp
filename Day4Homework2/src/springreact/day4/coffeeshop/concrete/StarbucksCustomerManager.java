package springreact.day4.coffeeshop.concrete;

import springreact.day4.coffeeshop.abstracts.BaseCustomerManager;
import springreact.day4.coffeeshop.abstracts.CustomerCheckService;
import springreact.day4.coffeeshop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {			
			super.save(customer);
		} else {			
			System.out.println("Not a valid person");
		}
	}
}
