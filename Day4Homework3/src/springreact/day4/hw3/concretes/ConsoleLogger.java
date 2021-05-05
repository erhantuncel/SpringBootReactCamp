package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.Logger;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Console Log -> " + message);
	}

}
