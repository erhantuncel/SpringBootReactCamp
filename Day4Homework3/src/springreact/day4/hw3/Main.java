package springreact.day4.hw3;

import java.time.LocalDate;

import springreact.day4.hw3.concretes.CampaignManager;
import springreact.day4.hw3.concretes.ConsoleLogger;
import springreact.day4.hw3.concretes.EgovernmentCheckManager;
import springreact.day4.hw3.concretes.GameManager;
import springreact.day4.hw3.concretes.OrderManager;
import springreact.day4.hw3.concretes.UserManager;
import springreact.day4.hw3.entities.Campaign;
import springreact.day4.hw3.entities.Game;
import springreact.day4.hw3.entities.Order;
import springreact.day4.hw3.entities.User;

public class Main {
	public static void main(String[] args) {

		System.out.println("------ USER OPERATIONS ------");
		User validUser = new User(1, "Ahmet", "OYUNCU", "12345678910", LocalDate.of(1984, 1, 1));
		User invalidUser = new User(2, "Mehmet", "OYUNCU", "12345678910", LocalDate.of(1984, 1, 1));
		UserManager userManager = new UserManager(new EgovernmentCheckManager(), new ConsoleLogger());

		userManager.add(validUser);
		userManager.add(invalidUser);
		validUser.setDateOfBirth(LocalDate.of(1984, 2, 1));
		userManager.update(validUser);
		userManager.update(invalidUser);
		userManager.delete(validUser);

		System.out.println("\n------ GAME OPERATIONS ------");
		Game game1 = new Game(1, "Game1", 100);
		GameManager gameManager = new GameManager(new ConsoleLogger());
		gameManager.add(game1);
		game1.setUnitPrice(200);
		gameManager.update(game1);
		gameManager.delete(game1);

		System.out.println("\n------ CAMPAIGN OPERATIONS ------");
		Campaign studentCampaign = new Campaign(1, "Student Campaign", 10);
		CampaignManager campaignManager = new CampaignManager(new ConsoleLogger());
		campaignManager.add(studentCampaign);
		studentCampaign.setDiscount(20);
		campaignManager.update(studentCampaign);
		campaignManager.delete(studentCampaign);
		Campaign springCampaign = new Campaign(2, "Spring Campaign", 50);
		campaignManager.add(springCampaign);

		System.out.println("\n------ ORDER OPERATIONS ------");
		Order order1 = new Order(1, 1, validUser, game1);
		OrderManager orderManager = new OrderManager(new ConsoleLogger());
		orderManager.add(order1);

		Order order2 = new Order(2, 1, validUser, game1);
		orderManager.addWithCampaign(order2, studentCampaign);

		Order order3 = new Order(3, 1, validUser, game1);
		orderManager.addWithCampaign(order3, springCampaign);
	}
}
