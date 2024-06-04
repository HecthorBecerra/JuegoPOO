package domain;
import java.util.Random;

public class Game {

	private Character character1;
	private Character character2;
	private Random random;

	public Game(Character aCharacter1, Character aCharacter2) {
		this.character1 = aCharacter1;
		this.character2 = aCharacter2;
		this.random = new Random();
	}
}


/*public void startCombat(Character aCharacter1, Character aCharacter2) {
	throw new UnsupportedOperationException();
	}

private void attackTurn(Character aCharacterAttacks, Character aCharacterDefends) {
	throw new UnsupportedOperationException();
}

private void declareWinner(Character aCharacter1, Character aCharacter2) {
	throw new UnsupportedOperationException();
}

private void showMenu(Character aCharacter1, Character aCharacter2) {
	throw new UnsupportedOperationException();
}*/