package com.thinkinjava;

import com.thinkinjava.multiplexing.Villain;

// Villain 为 public 时 在外包可以继承
// 默认的不可以

public class TestVillain extends Villain {

	public TestVillain() {
		testProtected();
	}
}
