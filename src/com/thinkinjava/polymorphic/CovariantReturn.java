package com.thinkinjava.polymorphic;

class Grain {

}

class Wheat extends Grain {

	public void f() {

	}
}

class Vegetable {

}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WeatMill extends Mill {

	// Э�䷵������
	// ����Ҳ���Ըı�����
	@Override
	Wheat process() {
		return new Wheat();
	}

	// Э�䷵������ֻ��������ԭ�������ͻ�ԭ�������͵�����Ŷ
	// @Override
	// Vegetable process() {
	// // TODO Auto-generated method stub
	// return new Vegetable();
	// }
}

public class CovariantReturn {

	public static void main(String[] args) {

		// ���� ��������ת��
		Grain grain = new Grain();

		try {

			if (grain instanceof Wheat) {
				Wheat wheat = (Wheat) grain;
			} else {
				System.out.println("û�н�������ת��");
			}

		} catch (Exception e) {
		}

	}
}
