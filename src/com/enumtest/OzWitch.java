package com.enumtest;

public enum OzWitch {

	// ������巽����������enumʵ������������һ���ֺ�;

	WEST("hello1"), NORTH("hello2"), EAST("hello3"), SOUTH("hello4"); // ʵ��

	private String description;

	// ֻ����enum������ڲ�ʹ���乹��������enumʵ����һ��enumʵ���Ķ������
	// �������Ͳ�����������ʹ���乹�췽��������ʵ����.

	private OzWitch(String description) {
		System.out.println("���췽�� :" + description);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static void main(String[] args) {

		for (OzWitch o : OzWitch.values()) {
			System.out.println(o.getDescription());
		}
		
	}
}
