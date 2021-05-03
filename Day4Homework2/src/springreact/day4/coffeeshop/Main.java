package springreact.day4.coffeeshop;

import java.util.Date;

import springreact.day4.coffeeshop.abstracts.BaseCustomerManager;
import springreact.day4.coffeeshop.adapters.MernisServiceAdapter;
import springreact.day4.coffeeshop.concrete.NeroCustomerManager;
import springreact.day4.coffeeshop.concrete.StarbucksCustomerManager;
import springreact.day4.coffeeshop.entities.Customer;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Ahmet", "KAHVESEVER", new Date(1984, 1, 1),"12345678901");

		System.out.println("-------- Starbucks Customer Manager --------");
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
		
		System.out.println("\n-------- Nero Customer Manager --------");
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer);
	}
}
