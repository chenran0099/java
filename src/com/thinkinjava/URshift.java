package com.thinkinjava;

public class URshift {

	public static void main(String[] args) {

		System.out.println("int");
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		// i >>>= 1;
		// System.out.println(Integer.toBinaryString(i));

		for (int j = 0; j < 32 + 1; j++) {
			i >>>= j;
			System.out.print("j : " + j + (j > 9 ? "   " : "    "));
			System.out.println(Integer.toBinaryString(i));
			i <<= j;
		}

		System.out.println("long");
		long l = -1;
		System.out.println(Long.toBinaryString(l));
		// l >>>= 10;
		// System.out.println(Long.toBinaryString(l));
		for (int j = 0; j < 64 + 1; j++) {
			l >>>= j;
			System.out.print("j : " + j + (j > 9 ? "   " : "    "));
			System.out.println(Long.toBinaryString(l));
			l <<= j;
		}

		System.out.println("short");
		short s = -1;
		System.out.println(Integer.toBinaryString(s));
		// s >>>= 10;
		// System.out.println(Integer.toBinaryString(s));
		for (int j = 0; j < 32 + 1; j++) {
			s >>>= j;
			System.out.print("j : " + j + (j > 9 ? "   " : "    "));
			System.out.println(Integer.toBinaryString(s));
			s <<= j;
		}

		System.out.println("byte");
		byte b = -1;

	}
}
