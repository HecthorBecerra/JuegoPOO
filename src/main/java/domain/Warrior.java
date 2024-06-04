package domain;
public class Warrior extends Champion {

	private int strength;

	public Warrior(String name,int hp,int attack,int defense, int strength) {
		super(name, hp, attack, defense);
		this.strength = strength;
	}

	public int attack(Champion aChampion) {
		throw new UnsupportedOperationException();
	}

	public int calculateDamage(Champion aChampion) {
		throw new UnsupportedOperationException();
	}
}