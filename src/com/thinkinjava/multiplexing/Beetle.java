package com.thinkinjava.multiplexing;

class Insect {

	private int i = 9;

	protected int j;

	public Insect() {
		// 4
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	// 1
	private static int x1 = printInit("Static Insect.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}

}

public class Beetle extends Insect {

	// 5
	private int k = printInit("Beetle.k initalized");

	public Beetle() {
		// 6
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	// 2
	private static int x2 = printInit("static Beetle.x2 initalized");

	public static void main(String[] args) {
		// 3
		System.out.println("Beetle Constructor");

		Beetle beetle = new Beetle();
	}
}

class BeetleTest {
	public static void main(String[] args) {
		Beetle beetle = new Beetle();
	}
}
