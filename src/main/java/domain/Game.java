package domain;
import java.util.Random;

public class Game {

	public void startCombat(Champion aChampion1, Champion aChampion2) {
		Champion attacker = aChampion1;
		Champion defender = aChampion2;
		while (aChampion1.isAlive() && aChampion2.isAlive()) {
			attackTurn(attacker, defender);
			Champion temp = attacker;
			attacker = defender;
			defender = temp;
		}
		declareWinner(aChampion1, aChampion2);
	}

	private void attackTurn(Champion aChampionAttacks, Champion aChampionDefends) {
		Random random = new Random();
		int damage = aChampionAttacks.attack + aChampionAttacks.weapon.getAttackPower() - aChampionDefends.defense;
		if (damage < 0) {
			damage = 0;
		}
		aChampionDefends.takeDamage(damage);
	}

	private void declareWinner(Champion aChampion1, Champion aChampion2) {
		if (aChampion1.isAlive()) {
			System.out.println(aChampion1.name + " wins!");
		} else {
			System.out.println(aChampion2.name + " wins!");
		}
	}

	public void showMenu(Champion aChampion1, Champion aChampion2) {
		System.out.println("1. Attack");
		System.out.println("2. Use potion");
		System.out.println("3. Use sanctuary");
		System.out.println("4. Change weapon");
		System.out.println("5. Exit");
	}
}


