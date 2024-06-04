package domain;

public class Champion {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	protected Weapon weapon;
	protected Potion potion;


	public Champion(String name, int hp, int attack, int defense, Weapon weapon) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.weapon = weapon;
	}

    public void takeDamage(int Damage){
		this.hp -= Damage;
		if (hp < 0){
			hp = 0;
		}
	}

	public boolean isAlive() {
		return hp > 0;
	}

	private boolean calculateLifeForPotion() {
        return hp < 20;
    }

	public void usePotion() {
		if (calculateLifeForPotion()){
			hp += potion.getHealing();
		}
	}

	public boolean sanctuaryProbability() {
		return Math.random() < 0.2;
	}

	public void useSanctuary(Sanctuary sanctuary) {
		if (sanctuaryProbability()){
			System.out.println(name + " successfully used sanctuary");
			defense += sanctuary.getDefense();
		}else{
			System.out.println(name + " failed to use sanctuary");
		}
	}

	public int getHp() {
		return hp;
	}

}




