package com.thinkinjava;

public class Opetation {

	static int i = 0;

	public static void main(String[] args) {

		// & | ^ ~

		// 编写一个 具有两个常量值的程序，一句具有交替的二进制位01，其中最低有效位为0，
		// 另一个也具有交替的二进制位1和0，但是其最低位是1
		int a = 0x5555;
		int b = 0xaaaa;

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));

		System.out.println("&");
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println("|");
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println("^");
		System.out.println(Integer.toBinaryString(a ^ b));
		System.out.println("~a");
		System.out.println(Integer.toBinaryString(~a));
		System.out.println("~b");
		System.out.println(Integer.toBinaryString(~b));

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 & b2);
		System.out.println(b1 | b2);
		System.out.println(b1 ^ b2);
		// System.out.println(~b2); // boolean 不能 使用 ~b

		// 短路运算
		if (test1() && test2()) {

		}

		System.out.println("i : " + i);

		// 位操作则没有短路运算
		if (test1() & test2()) {

		}

		System.out.println("i : " + i);
		

	}

	static boolean test1() {
		return false;
	}

	static boolean test2() {
		i++;
		return true;
	}
}
