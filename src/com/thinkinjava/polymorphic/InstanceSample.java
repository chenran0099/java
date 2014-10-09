package com.thinkinjava.polymorphic;

interface Feature {

	// 默认static final , 不允许私有
	int value = 5;

	public void swim();

	// 私有不允许 起不到抽象的作用 类似于继承
	// private void land();

	// 默认的是public
	void go();

}

abstract class Creature {
	// 不允许私有
	abstract void hehe();

	public void haha() {
	}
}

class Animation extends Creature {
	public void name() {

	}

	@Override
	void hehe() {

	}

}

class AlphaAnimation extends Animation implements Feature {

	@Override
	public void swim() {

	}

	@Override
	public void go() {
		// TODO Auto-generated method stub

	}

}

public class InstanceSample {

	public static void main(String[] args) {

		/** 都是instance **/

		AlphaAnimation alphaAnimation = new AlphaAnimation();

		
		
		if (alphaAnimation instanceof Creature) {
			System.out.println("alphaAnimation instance Creature");
		} else {
			System.out.println("alphaAnimation not instance Creature");
		}
		
		if (alphaAnimation instanceof Animation) {
			System.out.println("alphaAnimation instance Animation");
		} else {
			System.out.println("alphaAnimation not instance Animation");
		}

		if (alphaAnimation instanceof Feature) {
			System.out.println("alphaAnimation instance Feature");
		} else {
			System.out.println("alphaAnimation not instance Feature");
		}

	}
}
