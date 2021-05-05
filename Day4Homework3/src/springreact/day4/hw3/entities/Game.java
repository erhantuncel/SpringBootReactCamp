package springreact.day4.hw3.entities;

import springreact.day4.hw3.abstracts.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private double unitPrice;

	public Game() {

	}

	public Game(int id, String name, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Game Id: " + id + " Name: " + name + " Unit Price: " + unitPrice + " TL";
	}

}
