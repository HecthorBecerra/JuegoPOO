package domain;
import java.util.Random;

public class Character {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	protected Weapon weapon;
	protected Potion potion;
	protected Sanctuary sanctuary;

	public Character(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

    public void takeDamage(Character target) {

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
		if (hp < 20){
			return true;
		}
        return false;
    }

	public void usePotion() {
		if (calculateLifeForPotion()){
			hp += potion.getHealing();
		}
	}

}




	/*public void takeDamage(int aDamage) {
		throw new UnsupportedOperationException();
	}

	public boolean isAlive() {
		throw new UnsupportedOperationException();
	}

	private boolean calculateLifeForPotion() {
		throw new UnsupportedOperationException();
	}

	public void usePotion() {
		throw new UnsupportedOperationException();
	}

	private boolean sanctuaryProbability() {
		throw new UnsupportedOperationException();
	}

	public void useSanctuary(Sanctuary aSanctuary) {
		throw new UnsupportedOperationException();
	}

	public int attack(Character aCharacter) {
		throw new UnsupportedOperationException();
	}

	public int calculateDamage(Character aCharacter) {
		throw new UnsupportedOperationException();
	}
}/*