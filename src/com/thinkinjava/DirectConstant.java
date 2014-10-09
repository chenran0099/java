package com.thinkinjava;

// 直接常量 
public class DirectConstant {

	public static void main(String[] args) {

		// int 4字节
		int i1 = 0xffffffff;
		System.out.println(Integer.toBinaryString(i1));

		// char 2字节 (最大值)
		char c = 0xffff;
		System.out.println(Integer.toBinaryString(c));

		// short 2字节 (最大值)
		short s = 0x7fff;
		System.out.println(Integer.toBinaryString(s));

		// byte 1字节 (最大值)
		byte b = 0x7f;
		System.out.println(Integer.toBinaryString(b));

		// 数字后不带符号的不是int就是doule, 所以用下面的方式是不能看出基本类型的字节数的,因为下面的值代表int

		// long l = 0xffffffff * 4L;
		//
		// // float 4字节
		// float f = 0xffffffff;
		//
		// //
		// double d = 0xffffffff;

		// 2^31 = 2147483647;

		long l = 9223372036854775806L;
		// float f = ;
		// double d = ;

		boolean a;

		// 最大的float
		float maxFloat = 3.4028235e+38f;
		System.out.println("" + maxFloat);
		System.out.println(Float.MAX_VALUE);

		// 最大的double
		double maxDouble = 1.7976931348623157e+308;
		System.out.println("" + maxDouble);
		System.out.println(Double.MAX_VALUE);

	}
}
