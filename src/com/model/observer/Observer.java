package com.model.observer;

/**
 * �۲���ģʽ�Ƕ������Ϊģʽ���ֽз���-����(Publish/Subscribe)ģʽ��ģ��-��ͼ(Model/View)ģʽ��Դ-������(Source/Listener)ģʽ�������(Dependents)ģʽ��
 * 
 * �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ���������������������״̬�Ϸ����仯ʱ����֪ͨ���й۲��߶���ʹ�����ܹ��Զ������Լ���
 */
public interface Observer {

	public void update(String state);
}
