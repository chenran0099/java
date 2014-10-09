package com.thinkinjava.abstrace_interface.filters;

// （通过滤波器能够转换声音、电子信号等的）带通
public class BandPass extends Filter {

	double lowCut;
	double highCut;

	public BandPass(double lowCut, double highCut) {
		this.lowCut = lowCut;
		this.highCut = highCut;
	}

	@Override
	public WaveForm process(WaveForm input) {
		return input;
	}
}
