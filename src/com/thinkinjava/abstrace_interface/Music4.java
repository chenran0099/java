package com.thinkinjava.abstrace_interface;

/** ʹ�ó�����ͳ���ӿ� **/

//// ����
//abstract class Instrument {
//
//	/** abstract��interface���﷨���Ƹ��� **/
//
//	private int i;
//
//	public abstract void play(Note note); // ��������
//
//	public String what() {
//		return "Instrument";
//	}
//
//	public abstract void adjust();// ��������
//}
//
//// ������
//class Wind extends Instrument {
//
//	@Override
//	public void play(Note note) { // ����ʵ��
//		System.out.println("Wind.play() " + note);
//	}
//
//	@Override
//	public void adjust() {// ����ʵ��
//
//	}
//
//	// ������ѡ�����д
//	@Override
//	public String what() {
//		return "Wind";
//	}
//}
//
//// �������
//class Percussion extends Instrument {
//
//	@Override
//	public void play(Note note) {
//		System.out.println("Percussion.play() " + note);
//	}
//
//	@Override
//	public void adjust() {
//
//	}
//
//	@Override
//	public String what() {
//		return "Percussion";
//	}
//}
//
//// ���ң�������
//class Stringed extends Instrument {
//
//	@Override
//	public void play(Note note) {
//		System.out.println("Stringed.play() " + note);
//	}
//
//	@Override
//	public void adjust() {
//
//	}
//
//	@Override
//	public String what() {
//		return "Stringed";
//	}
//}
//
//// ��ͭ��
//class Brass extends Wind {
//
//	@Override
//	public void play(Note note) {
//		System.out.println("Brass.play() " + note);
//	}
//
//	@Override
//	public void adjust() {
//		System.out.println("Brass.addjust()");
//	}
//}
//
//// ľ������
//class WoodWind extends Wind {
//
//	@Override
//	public void play(Note note) {
//		System.out.println("WoodWind.play() " + note);
//	}
//
//	@Override
//	public String what() {
//		return "WoodWind";
//	}
//}
//
public class Music4 {

	// Ϊ������
	static void tune(Instrument instrument) {
		instrument.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] instruments) {
		for (Instrument instrument : instruments) {
			tune(instrument);
		}
	}

	public static void main(String[] args) {

//		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new WoodWind() };
//
//		tuneAll(orchestra);
//
//		// ��ϰ2
//		// �ⲻ��ʵ�����������𣬻��������ڲ������ʽ��?? �������ڲ���İ�
//		EmptyAbsClss emptyAbsClss = new EmptyAbsClss() {
//
//			@Override
//			public void swim() {
//				System.out.println("swim");
//			}
//		};
//		emptyAbsClss.show();
//		emptyAbsClss.swim();
//
//		// ��ϰ3
//		BasicClass subClass = new SubClass();
//		subClass.print();
	}
//}
//
//// ��ϰ2
//
//abstract class EmptyAbsClss {
//
//	public void show() {
//		System.out.println("hello");
//	}
//
//	public abstract void swim();
//}
//
//// ��ϰ3
//abstract class BasicClass {
//
//	public BasicClass() {
//		print(); // ��Ϊ��̬������������print()���������Ǵ�ʱ������ı�����û�г�ʼ��Ŷ,���Ի����0
//	}
//
//	public abstract void print();
//}
//
//class SubClass extends BasicClass {
//
//	private int a = 1;
//
//	@Override
//	public void print() {
//		System.out.println(a);
//	}
//
//	public SubClass() {
//	}
//
//}
//
//// ��ϰ4
//
//abstract class Song {
//
//}
//
//class PopularSong extends Song {
//
//	public void start() {
//
//	}
//
//	public static void begin(Song song) {
//		PopularSong popularSong = (PopularSong) song;
//	}
}
