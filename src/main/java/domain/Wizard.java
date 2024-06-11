package domain;
public class Wizard extends Champion {
		private int magicPower;

		public Wizard(String name, int hp, int attack, int defense, int magicPower) {
			super(name, hp, attack, defense);
			this.magicPower = magicPower;
		}

		public int attack(Champion enemy) {
			int damage = this.attack + this.magicPower + this.weapon.getAttackPower() - this.defense;
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