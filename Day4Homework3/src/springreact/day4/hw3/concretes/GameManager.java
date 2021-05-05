package springreact.day4.hw3.concretes;

import springreact.day4.hw3.abstracts.GameService;
import springreact.day4.hw3.abstracts.Logger;
import springreact.day4.hw3.entities.Game;

public class GameManager implements GameService {

	private Logger logger;

	public GameManager(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void add(Game game) {
		logger.log("Game is added: " + game.toString());
	}

	@Override
	public void update(Game game) {
		logger.log("Game is updated: " + game.toString());
	}

	@Override
	public void delete(Game game) {
		logger.log("Game is removed: " + game.toString());
	}

}
