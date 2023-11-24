public class HealerPlayer extends Player implements Heal {
	private int healPoints;

	public HealerPlayer(String name, int hp){
		super(name, hp);
		healPoints = 20;
	}

	public getHealPoints(){
		return healPoints;
	}

	public void heal(int p){
		if(p <= healPoints){
			setHp(getHp() + p);
			healPoints -= p;
		}
	}
}