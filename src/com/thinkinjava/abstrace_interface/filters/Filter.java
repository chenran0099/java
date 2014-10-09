package com.thinkinjava.abstrace_interface.filters;

//ÂË²¨Æ÷
public class Filter {

	public String name() {
		return this.getClass().getSimpleName();
	}

	public WaveForm process(WaveForm input) {
		return input;
	}

}
