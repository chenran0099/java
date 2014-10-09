package com.thinkinjava.abstrace_interface.filters;

public class HighPass extends Filter {

	double cutoff;// ÇÐ¶Ï

	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	@Override
	public WaveForm process(WaveForm input) {
		return input;
	}
}
