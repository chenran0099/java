package com.thinkinjava.ch05;

public class Exper01 {

	String userName = new String("hello");

	String name;

	public Exper01() {
	}

	public Exper01(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Exper01 exper01 = new Exper01();
		System.out.println(exper01.name);

		Exper01 exper012 = new Exper01("hehe");
		System.out.println(exper012.userName);
		System.out.println(exper012.name);
		exper012.userName = "lala";
		System.out.println(exper012.userName);
	}

}
