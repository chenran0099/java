package com.thinkinjava;

public class Opetation {

	static int i = 0;

	public static void main(String[] args) {

		// & | ^ ~

		// ��дһ�� ������������ֵ�ĳ���һ����н���Ķ�����λ01�����������ЧλΪ0��
		// ��һ��Ҳ���н���Ķ�����λ1��0�����������λ��1
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
		// System.out.println(~b2); // boolean ���� ʹ�� ~b

		// ��·����
		if (test1() && test2()) {

		}

		System.out.println("i : " + i);

		// λ������û�ж�·����
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
