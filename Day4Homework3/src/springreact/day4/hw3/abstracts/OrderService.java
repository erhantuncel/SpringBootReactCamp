package springreact.day4.hw3.abstracts;

import springreact.day4.hw3.entities.Campaign;
import springreact.day4.hw3.entities.Order;

public interface OrderService {
	public void add(Order order);
	public void addWithCampaign(Order order, Campaign campaign);
}
