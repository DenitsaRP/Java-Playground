package oopMortalKombat;

import java.util.Random;

public class Fighter {

	private final String name;
	private int helath = 100;
	private int damage = 5;
	private  int dogeChance = 30;
	private  int blockChance = 30;
	private int doges;
	private int blocks;
	private int maxHealth; 

	Fighter(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Phantom";
		}
		this.maxHealth = 100;
	}
	
	public Fighter(String name, int health, int damage, int blockChance, int dogeChance ) {
		this(name);
		this.helath = health;
		this.damage = damage;
		this.blockChance = blockChance;
		this.dogeChance = dogeChance;
		this.maxHealth = health;
	}

	public int getHelath() {
		return helath;
	}

	public void setHelath(int helath) {
		this.helath = helath;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void hit(Fighter enemy) {
		if (new Random().nextInt(100) < enemy.dogeChance) {
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage " + enemy.name
					+ " DOGES and he is left with " + enemy.helath + " helth.");
			enemy.doges++;
		} else if (new Random().nextInt(100) < enemy.blockChance) {
			enemy.helath -= this.damage / 2;
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage " + enemy.name
					+ " BLOCKS and he is left with " + enemy.helath + " helth.");
			enemy.blocks++;
		} else {
			enemy.helath -= this.damage;
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage " + enemy.name
					+ " and he is left with " + enemy.helath + " helth.");

		}
	}

	public boolean isDead() {
		return this.helath <= 0;
	}

	public void printInfo() {
		System.out.println(this.name + " had " + this.blocks + " blocks and " + this.doges + " doges");

	}
	
	public void revive() {
		this.helath = this.maxHealth;
	}

}
