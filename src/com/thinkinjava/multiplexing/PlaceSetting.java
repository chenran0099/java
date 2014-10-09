package com.thinkinjava.multiplexing;

/****/

class Plate { // 盘子

	public Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate { // 宴会盘子

	public DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
	}

}

/****/

class Utenil { // 器具

	public Utenil(int i) {
		System.out.println("Utenil constructor");
	}
}

class Spoon extends Utenil { // 勺子

	public Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utenil { // 叉子

	public Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

class Knife extends Utenil { // 刀子

	public Knife(int i) {
		super(i);
		System.out.println("Knife constructor");
	}
}

/****/
class Custom {
	public Custom(int i) {
		System.out.println("Custom constructor");
	}
}

public class PlaceSetting extends Custom {

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i + 1);

		// 强制初始化基类，但不能保证成员对象也必须初始化，所以需要自己处理注意

		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);

		System.out.println("PlaceSetting constructor");
	}

	public static void main(String[] args) {
		PlaceSetting placeSetting = new PlaceSetting(9);
	}

}
