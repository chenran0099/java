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
	// ֱ��ʵ���������ڹ��췽��ִ��
	private WaterSource waterSource = new WaterSource();// ������ ��ϵ���ʽ
	private int i;
	private float f;

	// �����ڹ��췽��ִ��
	{
		System.out.println("��̬��");
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

		System.out.println(sprinklerSystem); // ֱ�ӵ���toString()
	}

}
