import java.util.Scanner;

public class Model{
	public static void main(String[] args) {
		Game game = new GameWithBot(10);
		game.go();
	}
}