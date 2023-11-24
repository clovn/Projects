import java.util.Scanner;

public class GameWithHuman extends Game {

	public GameWithHuman(int maxHp){
		super(maxHp);
		Log.out("Введите имя второго игрока: ");
		p2 = new Player(in.nextLine(), maxHp);
	}

	public void gameProcess(){
		AbstractPlayer attacker = p1;
		AbstractPlayer enemy = p2;

		while(p1.isAlive() && p2.isAlive()){

			Log.out(attacker + "is going to kick " + enemy + "with force: ");
			int damage = in.nextInt();
			while(damage < 1 || damage > 9){
				Log.out("Incorrect force (1-10). Try again.");
				damage = in.nextInt();
			}

			boolean result = attacker.attack(enemy, damage);

			Log.logResult(result, enemy);

			AbstractPlayer tmp = attacker;
			attacker = enemy;
			enemy = tmp;
		}
	}
}