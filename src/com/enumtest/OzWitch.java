package com.enumtest;

public enum OzWitch {

	// 如果定义方法，必须在enum实例序列最后添加一个分号;

	WEST("hello1"), NORTH("hello2"), EAST("hello3"), SOUTH("hello4"); // 实例

	private String description;

	// 只能在enum定义的内部使用其构造器创建enum实例，一旦enum实例的定义结束
	// 编译器就不允许我们再使用其构造方法来创建实例了.

	private OzWitch(String description) {
		System.out.println("构造方法 :" + description);
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
