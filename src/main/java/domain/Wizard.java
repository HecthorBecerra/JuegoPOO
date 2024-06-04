package domain;
public class Wizard extends Champion {
		private int magicPower;

		Wizard(String name, int hp, int attack, int defense, int magicPower) {
			super(name, hp, attack, defense);
			this.magicPower = magicPower;
		}

		public int attack(Champion aChampion) {
			throw new UnsupportedOperationException();
		}

		public int calculateDamage(Champion aChampion) {
			throw new UnsupportedOperationException();
		}
}