import java.util.Scanner;

public abstract class Game {

	protected AbstractPlayer p1, p2;
	protected Scanner in = new Scanner(System.in);

	public Game(int maxHp){
		Log.out("Введите имя первого игрока: ");
		p1 = new Player(in.nextLine(), maxHp);
	}

	public void go(){
		start();
		gameProcess();
		end();
	}

	public void start(){
		Log.out("The battle has begun.");
	}

	public void end(){
		AbstractPlayer winner = p1.isAlive() ? p1 : p2;
		Log.out(winner.getName() + " won.");
	}

	public abstract void gameProcess();
}