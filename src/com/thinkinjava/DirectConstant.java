package com.thinkinjava;

// ֱ�ӳ��� 
public class DirectConstant {

	public static void main(String[] args) {

		// int 4�ֽ�
		int i1 = 0xffffffff;
		System.out.println(Integer.toBinaryString(i1));

		// char 2�ֽ� (���ֵ)
		char c = 0xffff;
		System.out.println(Integer.toBinaryString(c));

		// short 2�ֽ� (���ֵ)
		short s = 0x7fff;
		System.out.println(Integer.toBinaryString(s));

		// byte 1�ֽ� (���ֵ)
		byte b = 0x7f;
		System.out.println(Integer.toBinaryString(b));

		// ���ֺ󲻴����ŵĲ���int����doule, ����������ķ�ʽ�ǲ��ܿ����������͵��ֽ�����,��Ϊ�����ֵ����int

		// long l = 0xffffffff * 4L;
		//
		// // float 4�ֽ�
		// float f = 0xffffffff;
		//
		// //
		// double d = 0xffffffff;

		// 2^31 = 2147483647;

		long l = 9223372036854775806L;
		// float f = ;
		// double d = ;

		boolean a;

		// ����float
		float maxFloat = 3.4028235e+38f;
		System.out.println("" + maxFloat);
		System.out.println(Float.MAX_VALUE);

		// ����double
		double maxDouble = 1.7976931348623157e+308;
		System.out.println("" + maxDouble);
		System.out.println(Double.MAX_VALUE);

	}
}
