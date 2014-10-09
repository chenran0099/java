package com.thinkinjava.abstrace_interface;

/** 继承扩展接口 **/

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

/** 实现类 **/
class DragonZilla implements DangerousMonster {

	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}
}

/** 额哈 **/
interface Vampire extends DangerousMonster, Lethal { // 继承多个接口 特殊啊

	// 新添了一个方法
	void drinkBlood();

}

/** 实现类 **/
class VeryBadVampire implements Vampire {

	@Override
	public void destroy() {

	}

	@Override
	public void menace() {

	}

	@Override
	public void kill() {

	}

	@Override
	public void drinkBlood() {

	}

}

public class HorrorShow {

	static void u(Monster monster) {
		monster.menace();
	}

	static void v(DangerousMonster dangerousMonster) {
		dangerousMonster.menace();
		dangerousMonster.destroy();
	}

	static void w(Lethal lethal) {
		lethal.kill();
	}

	public static void main(String[] args) {

		DangerousMonster dangerousMonster = new DragonZilla();
		u(dangerousMonster);
		v(dangerousMonster);

		Vampire vampire = new VeryBadVampire();
		u(vampire);
		v(vampire);
		w(vampire);
	}

}
