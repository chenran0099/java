package com.thinkinjava.polymorphic;

class Grain {

}

class Wheat extends Grain {

	public void f() {

	}
}

class Vegetable {

}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WeatMill extends Mill {

	// 协变返回类型
	// 覆盖也可以改变类型
	@Override
	Wheat process() {
		return new Wheat();
	}

	// 协变返回类型只能是它的原返回类型或原返回类型的子类哦
	// @Override
	// Vegetable process() {
	// // TODO Auto-generated method stub
	// return new Vegetable();
	// }
}

public class CovariantReturn {

	public static void main(String[] args) {

		// 测试 向下类型转换
		Grain grain = new Grain();

		try {

			if (grain instanceof Wheat) {
				Wheat wheat = (Wheat) grain;
			} else {
				System.out.println("没有进行类型转换");
			}

		} catch (Exception e) {
		}

	}
}
