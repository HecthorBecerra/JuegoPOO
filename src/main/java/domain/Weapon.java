package domain;
public class Weapon {
	private String name;
	private int attackPower;
	private TypeDamage typeDamage;
	public Character character;

	public Weapon(String name, int attackPower, TypeDamage typeDamage) {
		this.name = name;
		this.attackPower = attackPower;
		this.typeDamage = typeDamage;
	}

	public int getAttackPower() {
		return this.attackPower;
	}
}