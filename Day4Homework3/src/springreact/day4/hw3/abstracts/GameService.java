package springreact.day4.hw3.abstracts;

import springreact.day4.hw3.entities.Game;

public interface GameService {
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
}
