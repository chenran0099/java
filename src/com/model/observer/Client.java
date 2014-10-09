package com.model.observer;

public class Client {

	public static void main(String[] args) {
		
		/** ����Observer���� **/
		Subject subject = new ConcreteSubject();
		
		Observer observer = new ConcreteObserver();
		
		subject.attach(observer);
		
		subject.notifyObservers("haha");
		
	}
}
