package domain;
public class Warrior extends Character {

	private int strength;

	public Warrior(String name,int hp,int attack,int defense, int strength) {
		super(name, hp, attack, defense);
		this.strength = strength;
	}

	public int attack(Character aCharacter) {
		throw new UnsupportedOperationException();
	}

	public int calculateDamage(Character aCharacter) {
		throw new UnsupportedOperationException();
	}
}