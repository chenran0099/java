package com.model.observer;

public class ConcreteSubject extends Subject {

	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState ){
		System.out.println("ConcreteSubject ֮ǰ" + state);
		state = newState;
		System.out.println("ConcreteSubject ֮��" + state);
		notifyObservers(state);
	}
}
