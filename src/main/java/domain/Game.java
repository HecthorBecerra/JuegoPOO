package domain;
import java.util.Random;
import java.util.Scanner;

public class Game {

	Sanctuary sanctuary;

	Wizard wizard;
	Weapon baston;

	Warrior warrior;
	Weapon sword;

	public Game() {
		baston = new Weapon("Bastón", 60, TypeDamage.MAGIC);
		wizard = new Wizard("Wizard", 178, 15, 15, 20);

		sword = new Weapon("Sword", 20, TypeDamage.PHYSICAL);
		warrior = new Warrior("Warrior", 300, 30, 15, 20);
		sanctuary = new Sanctuary(10);
	}

	public void startCombat() {
		Champion attacker = warrior;
		Champion defender = wizard;

		wizard.useSanctuary(sanctuary);
		warrior.useSanctuary(sanctuary);

		while (warrior.isAlive() && wizard.isAlive()) {
			System.out.println("Turno de " + attacker.name);
			attackTurn(attacker, defender);
			Champion temp = attacker;
			attacker = defender;
			defender = temp;
		}
		declareWinner(warrior, wizard);
	}

	private void attackTurn(Champion ChampionAttacks, Champion ChampionDefends) {
		int damage = ChampionAttacks.attack + ChampionAttacks.weapon.getAttackPower() - ChampionDefends.defense;
		System.out.println(ChampionAttacks.name + " attacks " + ChampionDefends.name + " with " + damage + " damage");
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


