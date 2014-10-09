package com.thinkinjava.multiplexing;

class Homer {

	// 重载

	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {
}

class Bart extends Homer {

	// 子类也可以重载

	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}

}

public class Hide {

	public static void main(String[] args) {

		// 分别调用重载方法

		Bart bart = new Bart();
		bart.doh('x');
		bart.doh(1.0f);
		bart.doh(new Milhouse());
	}

}
