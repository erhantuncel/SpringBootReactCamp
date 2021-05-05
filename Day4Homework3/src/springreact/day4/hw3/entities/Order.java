package springreact.day4.hw3.entities;

import springreact.day4.hw3.abstracts.Entity;

public class Order implements Entity {
	private int id;
	private int itemCount;
	private User user;
	private Game game;
	private double totalPrice;

	public Order() {

	}

	public Order(int id, int itemCount, User user, Game game) {
		this.id = id;
		this.itemCount = itemCount;
		this.user = user;
		this.game = game;
		this.totalPrice = game.getUnitPrice() * itemCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Order Id: " + id);
		stringBuilder.append("\tItem Count: " + itemCount);
		stringBuilder.append("\tUser name: " + user.getFirstName() + "\n");
		stringBuilder.append("Game: " + game.getName());
		stringBuilder.append("\tTotal Price: " + getTotalPrice() + "TL\n");
		return stringBuilder.toString();
	}

}
