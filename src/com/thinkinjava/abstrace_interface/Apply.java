package com.thinkinjava.abstrace_interface;

import java.util.Arrays;

class Process {

	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Process {

	/** 协变类型 **/
	@Override
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Process {
	/** 协变类型 **/
	@Override
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Process {
	/** 协变类型 **/
	@Override
	String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {

	public static String s = "Disagreement with beliefs is by definition incorrect";

	public static void process(Process p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}

	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}

}
