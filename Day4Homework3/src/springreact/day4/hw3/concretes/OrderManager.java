package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.Logger;
import springreact.day4.hw3.abstracts.OrderService;
import springreact.day4.hw3.entities.Campaign;
import springreact.day4.hw3.entities.Order;

public class OrderManager implements OrderService {

	private Logger logger;

	public OrderManager(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void add(Order order) {
		logger.log("Order is added: \n" + order.toString());
	}

	@Override
	public void addWithCampaign(Order order, Campaign campaign) {
		double discountedPrice = order.getTotalPrice() * ((100 - campaign.getDiscount()) / 100);
		order.setTotalPrice(discountedPrice);
		logger.log("Order is added (" + campaign.getName() + " - " + campaign.getDiscount() + "%): \n" + order.toString());
	}

}
