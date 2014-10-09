package com.thinkinjava.abstrace_interface.filters;

public class LowPass extends Filter {

	double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	@Override
	public WaveForm process(WaveForm input) {
		return input;
	}
}
