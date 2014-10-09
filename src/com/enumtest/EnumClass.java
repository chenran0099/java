package com.enumtest;

public class EnumClass {

	// 编译器会自动生成一个继承自Enum的类
	enum Shurbbery {
		GROUND, CRAWLING, HANGING;

		// 添加方法或构造方法必须加上分号;

		Shurbbery() {
			System.out.println("构造方法");
		}

		@Override
		public String toString() {
			System.out.println("toString : " + super.toString());
			return super.toString();
		}

	};

	public static void main(String[] args) {

		for (Shurbbery shurbbery : Shurbbery.values()) {

			System.out.println("-------");
			System.out.println(shurbbery);
			System.out.println(shurbbery.name());
			System.out.println(shurbbery.ordinal());
			System.out.println(shurbbery.getClass());
			System.out.println(shurbbery.getDeclaringClass());
			System.out.println(Shurbbery.valueOf("GROUND"));

			// 自动生成的enum类实现了Comparable和Serializable接口
			System.out.println(shurbbery.equals(Shurbbery.CRAWLING));
			System.out.println(shurbbery == Shurbbery.CRAWLING);

		}

	}

}
