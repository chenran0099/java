package com.thinkinjava.multiplexing;

class Cleanser {

	{
		System.out.println("Cleanser static");
	}

	private String s = "CleanSer";

	public Cleanser() {
		System.out.println("Cleanser()");
	}

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute() ");
	}

	public void apply() {
		append(" apply() ");
	}

	public void scrub() {
		append(" scrub() ");
	}

	@Override
	public String toString() {
		System.out.println("Cleanser toString()");
		return s;
	}

	public static void main(String[] args) {
		// 重新实例化对象
		Cleanser cleanser = new Cleanser();
		cleanser.dilute();
		cleanser.apply();
		cleanser.scrub();
		System.out.println(cleanser);
	}

}

public class Detergent extends Cleanser {

	// 注意和父类的执行顺序

	// ps.静态的都会先于构造方法执行
	{
		System.out.println("Detergent static");
	}

	public Detergent() { // 默认会调用父类的构造方法
		// super();
		System.out.println("Detergent()");
	}

	@Override
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub(); // 如果注释掉就是不调用父类的方法，直接覆盖了父类的实现
	}

	// 直接操作的是父类的方法和变量
	public void foam() {
		append(" foam() ");
	}

	public static void main(String[] args) {

		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);

		System.out.println("Test base class");
		Cleanser.main(args);
	}

}
