package com.thinkinjava.abstrace_interface.filters;

//²¨ÐÎ
public class WaveForm {

	private static long counter;
	private final long id = counter++;

	@Override
	public String toString() {
		return "WaveForm " + id;
	}
}
