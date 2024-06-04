package domain;
public class Warrior extends Champion {
	private final int strength;

	public Warrior(String name,int hp,int attack,int defense, int strength, Weapon weapon) {
		super(name, hp, attack, defense, weapon);
		this.strength = strength;
	}

	public int attack(Champion enemy) {
		int damage = this.attack + this.strength + this.weapon.getAttackPower() - this.defense;
		System.out.println(name + " attacks " + enemy.name + " with " + damage + " damage");
		if (damage < 0) {
			damage = 0;
		}
		enemy.takeDamage(damage);
		return damage;
	}

	public int calculateDamage(Champion enemy) {
		return this.attack(enemy);
	}
}