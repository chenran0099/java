package com.thinkinjava.abstrace_interface.filters;

// ��ͨ���˲����ܹ�ת�������������źŵȵģ���ͨ
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
