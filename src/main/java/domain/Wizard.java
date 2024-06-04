package domain;
public class Wizard extends Character {
		private int magicPower;

		Wizard(String name, int hp, int attack, int defense, int magicPower) {
			super(name, hp, attack, defense);
			this.magicPower = magicPower;
		}

		public int attack(Character aCharacter) {
			throw new UnsupportedOperationException();
		}

		public int calculateDamage(Character aCharacter) {
			throw new UnsupportedOperationException();
		}
}