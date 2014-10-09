package com.thinkinjava.abstrace_interface;

// 练习10
interface Playable {
	void play(Note note);
}

// 乐器
interface Instrument extends Playable {

	int VALUE = 5; // static & final

	// public abstract void play(Note note); // 等价 其实就是abstract

	// // 默认的都是public,且只能是public
	// void play(Note note);

	void adjust();
}

// 管乐器
class Wind implements Instrument {

	@Override
	public void play(Note note) {
		System.out.println("Wind.play() " + note);
	}

	@Override
	public void adjust() {
		System.out.println("Wind.adjust()");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

// 打击乐器
class Percussion implements Instrument {

	@Override
	public void play(Note note) {
		System.out.println(this + ".play() " + note);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Percussion";
	}

}

// 有弦（乐器）
class Stringed implements Instrument {

	@Override
	public void play(Note note) {
		System.out.println(this + ".play() " + note);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}

	@Override
	public String toString() {
		return "Stringed";
	}
}

// 黄铜器
class Brass extends Wind {

	@Override
	public String toString() {
		return "Brass";
	}
}

// 木管乐器
class WoodWind extends Wind {

	@Override
	public String toString() {
		return "WoodWind";
	}
}

public class Music5 {
	// 为…调音
	// static void tune(Instrument instrument) {
	// instrument.play(Note.MIDDLE_C);
	// }
	//
	// static void tuneAll(Instrument[] instruments) {
	// for (Instrument instrument : instruments) {
	// tune(instrument);
	// }
	// }

	// 练习10
	static void tune(Playable playable) {
		playable.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] playables) {
		for (Playable playable : playables) {
			tune(playable);
		}
	}

	public static void main(String[] args) {

		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new WoodWind() };

		tuneAll(orchestra);
	}

}
