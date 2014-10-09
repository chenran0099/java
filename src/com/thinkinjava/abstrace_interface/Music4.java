package com.thinkinjava.abstrace_interface;

/** 使用抽象类和抽象接口 **/

//// 乐器
//abstract class Instrument {
//
//	/** abstract比interface的语法限制更少 **/
//
//	private int i;
//
//	public abstract void play(Note note); // 方法定义
//
//	public String what() {
//		return "Instrument";
//	}
//
//	public abstract void adjust();// 方法定义
//}
//
//// 管乐器
//class Wind extends Instrument {
//
//	@Override
//	public void play(Note note) { // 方法实现
//		System.out.println("Wind.play() " + note);
//	}
//
//	@Override
//	public void adjust() {// 方法实现
//
//	}
//
//	// 可以有选择的重写
//	@Override
//	public String what() {
//		return "Wind";
//	}
//}
//
//// 打击乐器
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
//// 有弦（乐器）
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
//// 黄铜器
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
//// 木管乐器
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

	// 为…调音
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
//		// 练习2
//		// 这不是实例化抽象类吗，还是这是内部类的形式啊?? 好像是内部类的啊
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
//		// 练习3
//		BasicClass subClass = new SubClass();
//		subClass.print();
	}
//}
//
//// 练习2
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
//// 练习3
//abstract class BasicClass {
//
//	public BasicClass() {
//		print(); // 因为多态，会调用子类的print()方法，但是此时的子类的变量还没有初始化哦,所以会出现0
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
//// 练习4
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
