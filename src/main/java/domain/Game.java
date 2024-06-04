package domain;
import java.util.Random;
import java.util.Scanner;

public class Game {

	Wizard wizard;
	Warrior warrior;

	public Game() {
		wizard = new Wizard("Wizard", 100, 10, 5, 10);
		warrior = new Warrior("Warrior", 100, 10, 5, 10);
		Sanctuary sanctuary = new Sanctuary(10);

		wizard.useSanctuary(sanctuary);
		warrior.useSanctuary(sanctuary);
	}

	public void startCombat() {
		Champion attacker = warrior;
		Champion defender = wizard;
		while (warrior.isAlive() && wizard.isAlive()) {
			attackTurn(attacker, defender);
			Champion temp = attacker;
			attacker = defender;
			defender = temp;
		}
		declareWinner(warrior, wizard);
	}

	private void attackTurn(Champion ChampionAttacks, Champion ChampionDefends) {
		int damage = ChampionAttacks.attack + ChampionAttacks.weapon.getAttackPower() - ChampionDefends.defense;
		if (damage < 0) {
			damage = 0;
		}
		ChampionDefends.takeDamage(damage);
	}

	private void declareWinner(Champion Champion1, Champion Champion2) {
		if (Champion1.isAlive()) {
			System.out.println(Champion1.name + " wins!");
		} else {
			System.out.println(Champion2.name + " wins!");
		}
	}

	public void showMenu(Champion Champion1, Champion Champion2) {
		System.out.println("1. Attack");
		System.out.println("2. Use potion");
		System.out.println("3. Change weapon");
		System.out.println("4. Exit");
	}
}


