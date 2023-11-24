public class EasyBot extends Bot {
	private int damage = 2;

	public EasyBot(int hp){
		super("EasyBot", hp);
	}

	public boolean attack(AbstractPlayer enemy){
		return this.attack(enemy, damage);
	}
}