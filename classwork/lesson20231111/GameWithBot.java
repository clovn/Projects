public class GameWithBot extends Game {

	public GameWithBot(int maxHp){
		super(maxHp);
		p2 = new EasyBot(maxHp);
	}

	public void gameProcess(){
		Bot bot = (Bot) p2;

		while(p1.isAlive() && p2.isAlive()){

			Log.out(p1 + "is going to kick " + bot + "with force: ");
			int damage = in.nextInt();
			while(damage < 1 || damage > 9){
				Log.out("Incorrect force (1-10). Try again.");
				damage = in.nextInt();
			}

			boolean result = p1.attack(bot, damage);
			Log.logResult(result, bot);
			

			Log.out(bot + " is going to kick " + p1);
			boolean result = bot.attack(p1);
			Log.logResult(result, p1);

		}
	}
}