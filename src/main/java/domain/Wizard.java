package domain;
public class Wizard extends Champion {
		private int magicPower;

		public Wizard(String name, int hp, int attack, int defense, int magicPower, Weapon weapon) {
			super(name, hp, attack, defense, weapon);
			this.magicPower = magicPower;
		}

		public int attack(Champion enemy) {
			int damage = this.attack + this.magicPower + this.weapon.getAttackPower() - this.defense;
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