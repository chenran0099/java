package com.model.observer;

public class ConcreteSubject extends Subject {

	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState ){
		System.out.println("ConcreteSubject 之前" + state);
		state = newState;
		System.out.println("ConcreteSubject 之后" + state);
		notifyObservers(state);
	}
}
