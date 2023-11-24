public abstract class AbstractPlayer {
	private int hp;
	private String name;

	public AbstractPlayer(String name, int hp){
		this.hp = hp;
		this.name = name;
	}

	public boolean attack(AbstractPlayer enemy, int damage){
		double chance = (damage - 1.0) / 10;
		if(Math.random() > chance){
			enemy.hp -= damage;
			return true;
		}
		return false;
	}

	public boolean isAlive(){
		return hp > 0;
	}

	public int getHp(){
		return hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return name + "(" + hp + ")";
	}
}