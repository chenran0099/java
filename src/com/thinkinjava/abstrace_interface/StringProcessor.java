package com.thinkinjava.abstrace_interface;

public abstract class StringProcessor implements Processor {

	// �Ҳݣ� ��������Բ�ʵ�ֽӿ��еķ������������ǵ������Ǳ���ʵ�ֵģ�����һ��һ������·�

	@Override
	public String name() {
		return null;
	}

	// **** ��Ҫ

	// ����������˵�Ļ�������ֻҪ����ʵ���˷��������ˣ������м���������ʲô�����������ڱ������ּ���һ��abstractͬ���ķ����������໹��ʵ���ˣ������ӿڻ����ܵ���������

	// �����Ǹ�ʵ�ֵģ������ָ������ɳ����abstract�� , ������ʹ�������ʵ��process����
	public abstract Object process(Object input);
}
