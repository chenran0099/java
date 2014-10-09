package com.thinkinjava.multiplexing;

class WaterSource {

	private String s;

	public WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	@Override
	public String toString() {
		return s;
	}

}

public class SprinklerSystem {

	private String valve1, valve2, valve3, valve4;
	// 直接实例化，先于构造方法执行
	private WaterSource waterSource = new WaterSource();// 复用类 组合的形式
	private int i;
	private float f;

	// 会先于构造方法执行
	{
		System.out.println("静态区");
	}

	public SprinklerSystem() {
		System.out.println("SprinklerSystem()");
	}

	@Override
	public String toString() {
		System.out.println("SprinklerSystem toString()");
		return "valve1 = " + valve1 + " valve2 = " + valve2 + " valve3 = " + valve3 + " valve4 = " + valve4 + "\n" + "i = " + i + " f = " + f + "\n" + "waterSource = " + waterSource;
	}

	public static void main(String[] args) {

		SprinklerSystem sprinklerSystem = new SprinklerSystem();

		System.out.println(sprinklerSystem.toString());

		System.out.println("------------------------");

		System.out.println(sprinklerSystem); // 直接调用toString()
	}

}
