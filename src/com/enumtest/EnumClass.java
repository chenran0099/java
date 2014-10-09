package com.enumtest;

public class EnumClass {

	// ���������Զ�����һ���̳���Enum����
	enum Shurbbery {
		GROUND, CRAWLING, HANGING;

		// ��ӷ������췽��������Ϸֺ�;

		Shurbbery() {
			System.out.println("���췽��");
		}

		@Override
		public String toString() {
			System.out.println("toString : " + super.toString());
			return super.toString();
		}

	};

	public static void main(String[] args) {

		for (Shurbbery shurbbery : Shurbbery.values()) {

			System.out.println("-------");
			System.out.println(shurbbery);
			System.out.println(shurbbery.name());
			System.out.println(shurbbery.ordinal());
			System.out.println(shurbbery.getClass());
			System.out.println(shurbbery.getDeclaringClass());
			System.out.println(Shurbbery.valueOf("GROUND"));

			// �Զ����ɵ�enum��ʵ����Comparable��Serializable�ӿ�
			System.out.println(shurbbery.equals(Shurbbery.CRAWLING));
			System.out.println(shurbbery == Shurbbery.CRAWLING);

		}

	}

}
