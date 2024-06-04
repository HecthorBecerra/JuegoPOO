public class Character {
	private String name;
	private int hp;
	private int attack;
	private int defense;
	private Weapon weapon;
	private Potion potion;
	public Sanctuary sanctuary;

	public void takeDamage(int aDamage) {
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
}