package com.thinkinjava.abstrace_interface;

public abstract class StringProcessor implements Processor {

	// 我草， 抽象类可以不实现接口中的方法？但是他们的子类是必须实现的，就是一层一层的往下分

	@Override
	public String name() {
		return null;
	}

	// **** 重要

	// 看这样子来说的话，就是只要子类实现了方法就行了，不管中间又增加了什么操作，例如在本类中又加了一个abstract同名的方法，但子类还是实现了，这样接口还是能调到方法的

	// 本来是该实现的，但是又给他整成抽象的abstract了 , 这样促使子类必须实现process方法
	public abstract Object process(Object input);
}
