package com.thinkinjava.abstrace_interface.filters;

import com.thinkinjava.abstrace_interface.Processor;

public class FileterAdapter implements Processor {

	Filter filter;

	public FileterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Object process(Object input) {
		return filter.process((WaveForm) input);
	}

}
