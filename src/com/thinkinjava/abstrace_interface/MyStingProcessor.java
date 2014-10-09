package com.thinkinjava.abstrace_interface;

public class MyStingProcessor extends StringProcessor {

	@Override
	public Object process(Object input) {
		return "hehe";
	}

	public static void main(String[] args) {

		Processor processor = new MyStingProcessor();
		System.out.println(processor.process(null));
	}
}
