package com.model.strategy;

/**
 * ����ģʽ���ڶ������Ϊģʽ�������������һ���㷨����ÿһ���㷨��װ�����й�ͬ�ӿڵĶ��������У��Ӷ�ʹ�����ǿ����໥�滻������ģʽʹ���㷨�����ڲ�Ӱ�쵽�ͻ��˵�����·����仯��
 *
 * ps.�������LoadingLoayout
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void contextStrategy() {
		strategy.strategyInterface();
	}
}
