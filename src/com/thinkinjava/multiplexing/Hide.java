package com.thinkinjava.multiplexing;

class Homer {

	// ����

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

	// ����Ҳ��������

	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}

}

public class Hide {

	public static void main(String[] args) {

		// �ֱ�������ط���

		Bart bart = new Bart();
		bart.doh('x');
		bart.doh(1.0f);
		bart.doh(new Milhouse());
	}

}
