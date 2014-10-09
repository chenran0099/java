package com.thinkinjava.abstrace_interface;

/** �̳���չ�ӿ� **/

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

/** ʵ���� **/
class DragonZilla implements DangerousMonster {

	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}
}

/** ��� **/
interface Vampire extends DangerousMonster, Lethal { // �̳ж���ӿ� ���Ⱑ

	// ������һ������
	void drinkBlood();

}

/** ʵ���� **/
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
