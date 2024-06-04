package domain;
public class Warrior extends Champion {
	private final int strength;

	public Warrior(String name,int hp,int attack,int defense, int strength) {
		super(name, hp, attack, defense, new Weapon("Sword", 20, TypeDamage.PHYSICAL));
		this.strength = strength;
	}

	public int attack(Champion enemy) {
		int damage = this.attack + this.strength + this.weapon.getAttackPower() - this.defense;
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