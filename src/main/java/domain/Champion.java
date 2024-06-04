package domain;

public class Champion {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	protected Weapon weapon;
	protected Potion potion;


	public Champion(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

    public void takeDamage(Champion target) {

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

	private boolean sanctuaryProbability() {
		return Math.random() < 0.2;
	}

	public void useSanctuary(Sanctuary sanctuary) {
		if (sanctuaryProbability()){
			defense += sanctuary.getDefense();
		}
	}

	public int attack(Champion target) {
		int damage = this.attack + this.weapon.getAttackPower() - target.defense;
		if (damage < 0) {
			damage = 0;
		}
		target.takeDamage(damage);
		return damage;
	}

	public int calculateDamage(Champion target) {
		return this.attack(target);
	}

}




