package com.thinkinjava.abstrace_interface;

// ��ϰ10
interface Playable {
	void play(Note note);
}

// ����
interface Instrument extends Playable {

	int VALUE = 5; // static & final

	// public abstract void play(Note note); // �ȼ� ��ʵ����abstract

	// // Ĭ�ϵĶ���public,��ֻ����public
	// void play(Note note);

	void adjust();
}

// ������
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

// �������
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

// ���ң�������
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

// ��ͭ��
class Brass extends Wind {

	@Override
	public String toString() {
		return "Brass";
	}
}

// ľ������
class WoodWind extends Wind {

	@Override
	public String toString() {
		return "WoodWind";
	}
}

public class Music5 {
	// Ϊ������
	// static void tune(Instrument instrument) {
	// instrument.play(Note.MIDDLE_C);
	// }
	//
	// static void tuneAll(Instrument[] instruments) {
	// for (Instrument instrument : instruments) {
	// tune(instrument);
	// }
	// }

	// ��ϰ10
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
