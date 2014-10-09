package com.thinkinjava;

import java.util.Random;

public class Assignment {

	public static void main(String[] args) {

		Tank t1 = new Tank();
		Tank t2 = new Tank();

		System.out.println(" ==" + (t1 == t2));

		t1.price = 10.0f;
		t2.price = 20.0f;

		System.out.println("t1.price : " + t1.price + "  t2.price : " + t2.price);

		/** 别名现象 **/
		t1 = t2;

		System.out.println(" ==" + (t1 == t2));

		System.out.println("t1.price : " + t1.price + "  t2.price : " + t2.price);

		t1.price = 30.0f;

		System.out.println("t1.price : " + t1.price + "  t2.price : " + t2.price);

		/** 方法调用中的别名现象 **/

		changeTank(t1);

		System.out.println("t1.price : " + t1.price + "  t2.price : " + t2.price);

		// 测试随机数
		Random random = new Random(47); // 提供种子

		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextFloat());
		System.out.println(random.nextFloat());

		float f = 10.1f;
		System.out.println(+10.1f);
		System.out.println(-10.1f);
		System.out.println(+f);
		System.out.println(-f);

		// + 号用于低类型提升int

		/** == equalse **/
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);

		System.out.println(n1 == n2); // 比较的堆的地址
		System.out.println(n1.equals(n2));

		int a = 1;
		int b = 2;
		// System.out.println(a.equals(b)); // 编码错误

	}

	static void changeTank(Tank tank) {
		tank.price = 50.0f;
	}

}

class Tank {
	float price;
}
