package com.thinkinjava;

public class EqualsTest {

	public static void main(String[] args) {

		Dog spotDog = new Dog();
		spotDog.name = "spot";
		spotDog.says = "Ruff";

		Dog scruffyDog = new Dog();
		scruffyDog.name = "scruffy";
		scruffyDog.says = "Wurf";
		// scruffyDog.name = "spot";
		// scruffyDog.says = "Ruff";

		System.out.println("---");
		System.out.println(spotDog == scruffyDog);
		System.out.println(spotDog.equals(scruffyDog));

		Dog newDog = spotDog;

		System.out.println("---");
		System.out.println(spotDog == scruffyDog);
		System.out.println(spotDog.equals(scruffyDog));

		System.out.println("---");
		System.out.println(spotDog == newDog);
		System.out.println(spotDog.equals(newDog));

		System.out.println("---");
		System.out.println(newDog == scruffyDog);
		System.out.println(newDog.equals(scruffyDog));

		// "s".equals("a");

		/** 默认的equalse **/
		// public boolean equals(Object obj) {
		// return (this == obj);
		// }

		/** String equlse **/
		// public boolean equals(Object anObject) {
		// if (this == anObject) {
		// return true;
		// }
		// if (anObject instanceof String) {
		// String anotherString = (String)anObject;
		// int n = value.length;
		// if (n == anotherString.value.length) {
		// char v1[] = value;
		// char v2[] = anotherString.value;
		// int i = 0;
		// while (n-- != 0) {
		// if (v1[i] != v2[i])
		// return false;
		// i++;
		// }
		// return true;
		// }
		// }
		// return false;
		// }
		
		// 结论: 需要自己重载equals

	}
}

class Dog {
	String name;
	String says;
}
