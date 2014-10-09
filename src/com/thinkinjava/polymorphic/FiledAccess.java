package com.thinkinjava.polymorphic;


class Super {

	public int field = 0;

	public int getField() {
		return field;
	}
}

class Stub extends Super {

	public int field = 1;

	public int getField() {
		return field;
	}

	public int getSuperField() {
		return super.field;
	}

}

public class FiledAccess {

	public static void main(String[] args) {

		Super sup = new Stub();

		// 域没有多态
		// 静态方法也没有多态
		// 多态就是动态绑定，调用子类方法
		
		System.out.println("sup.field = " + sup.field 
							+ " sup.getField() = " + sup.getField());

		Stub sub = new Stub();

		System.out.println("sub.field = " + sub.field 
							+ " sub.getField() = " + sub.getField() 
							+ " sub.getSuperField() = " + sub.getSuperField());

	}
}
