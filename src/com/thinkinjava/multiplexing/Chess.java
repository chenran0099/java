package com.thinkinjava.multiplexing;

class Game {

	// �в��޲λ��

	public Game() {
		System.out.println("Game Constructor �޲�");
	}

	public Game(int i) {
		System.out.println("Game Constructor" + i);
	}
}

class BoardGmale extends Game {

	public BoardGmale(int i) {
		// super(i);
		System.out.println("BoardGmale Constructor" + i);
	}

}

public class Chess extends BoardGmale {

	public Chess(int i) {
		super(i);
		System.out.println("Chess Constructor" + i);
	}

	public static void main(String[] args) {

		Chess chess = new Chess(11);
	}

}
