import java.util.Scanner;

public class Player extends AbstractPlayer {
	private Scanner in = new Scanner(System.in);

	public Player(String name, int hp){
		super(name, hp);
	}
}