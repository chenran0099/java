package com.thinkinjava.abstrace_interface;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter fight");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

	// @Override
	// public void fight() {
	// System.out.println("Hero fight");
	// }

	@Override
	public void fly() {
		System.out.println("Hero fly");
	}

	@Override
	public void swim() {
		System.out.println("Hero swim");
	}
}

public class Adventure {

	public static void t(CanFight canFight) {
		canFight.fight();
	}

	public static void u(CanSwim canSwim) {
		canSwim.swim();
	}

	public static void v(CanFly canFly) {
		canFly.fly();
	}

	public static void w(ActionCharacter actionCharacter) {
		actionCharacter.fight();
	}

	public static void main(String[] args) {

		Hero hero = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);

		// CanFight和ActionCharacter 方法签名一致 调的是同一个方法

	}

}
