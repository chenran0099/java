package com.thinkinjava.multiplexing;

class Amphibian {

	protected void test() {
		System.out.println("Amphibian test");
	}

	protected static void showSelf(Amphibian amphibian) {
		System.out.println("Amphibian showSelf");
		amphibian.test();
	}

}

public class Frog extends Amphibian {

	@Override
	protected void test() {
		System.out.println("Frog test");
		super.test();
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.showSelf(frog);
	}

}
