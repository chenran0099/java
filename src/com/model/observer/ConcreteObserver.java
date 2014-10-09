package com.model.observer;

public class ConcreteObserver implements Observer {

	private String observerState;

	@Override
	public void update(String state) {
		System.out.println("ConcreteObserver ֮ǰ " + observerState);
		observerState = state;
		System.out.println("ConcreteObserver ���� " + observerState);
	}

}
