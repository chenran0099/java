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
		// ����ʵ��������
		Cleanser cleanser = new Cleanser();
		cleanser.dilute();
		cleanser.apply();
		cleanser.scrub();
		System.out.println(cleanser);
	}

}

public class Detergent extends Cleanser {

	// ע��͸����ִ��˳��

	// ps.��̬�Ķ������ڹ��췽��ִ��
	{
		System.out.println("Detergent static");
	}

	public Detergent() { // Ĭ�ϻ���ø���Ĺ��췽��
		// super();
		System.out.println("Detergent()");
	}

	@Override
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub(); // ���ע�͵����ǲ����ø���ķ�����ֱ�Ӹ����˸����ʵ��
	}

	// ֱ�Ӳ������Ǹ���ķ����ͱ���
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
