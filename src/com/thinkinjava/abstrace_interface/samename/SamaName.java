package com.thinkinjava.abstrace_interface.samename;

/** 实现多重继承的时候，如果方法完全相同则没有问题，但是当方法的签名或者返回类型不一样时会出现问题 **/

interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {

	@Override
	public void f() {

	}

	@Override
	public int f(int i) {
		return 0;
	}
}

class C3 extends C implements I2 {

	@Override
	public int f(int i) {
		return 0;
	}
}

class C4 extends C implements I3 {

}

// 涉及到了不是方法的重载，方法名冲突了就错误了

// 错误
// class C5 extends C implements I1 {
//
// }

// 错误
// interface I4 extends I1, I3 {
//
// }

public class SamaName {

}
