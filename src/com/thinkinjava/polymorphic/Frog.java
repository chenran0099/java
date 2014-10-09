package com.thinkinjava.polymorphic;

/** ºÃ≥–”Î«Â¿Ì **/

class Characteristic {

	private String s;

	public Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}

	protected void dispose() {
		System.out.println("dispose Characteristic " + s);
	}

}

class Description {

	private String s;

	public Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}

	protected void dispose() {
		System.out.println("dispose Description " + s);
	}

}

//

class LivingCreature {

	private Characteristic characteristic = new Characteristic("is alive");
	private Description description = new Description("Basic Living Creature");

	public LivingCreature() {
		System.out.println("LivingCreature()");
	}

	protected void dispose() {
		System.out.println("LivingCreature dispose");
		description.dispose();
		characteristic.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic characteristic = new Characteristic("has heart");
	private Description description = new Description("Animal not Vegetable");

	public Animal() {
		System.out.println("Animal()");
	}

	@Override
	protected void dispose() {
		System.out.println("Animal dispose");
		description.dispose();
		characteristic.dispose();
		super.dispose();
	}

}

class Amphibian extends Animal {
	private Characteristic characteristic = new Characteristic("can live in water");
	private Description description = new Description("Both water and land");

	public Amphibian() {
		System.out.println("Amphibian()");
	}

	@Override
	protected void dispose() {
		System.out.println("Amphibian dispose");
		description.dispose();
		characteristic.dispose();
		super.dispose();
	}

}

public class Frog extends Amphibian {

	private Characteristic characteristic = new Characteristic("Croaks");
	private Description description = new Description("Eats Bugs");

	public Frog() {
		System.out.println("Frog()");
	}

	@Override
	protected void dispose() {
		System.out.println("Frog dispose");
		description.dispose();
		characteristic.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}

}
