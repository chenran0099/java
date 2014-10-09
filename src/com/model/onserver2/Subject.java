package com.model.onserver2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> list = new ArrayList<Observer>();

	public void attach(Observer observer) {

		list.add(observer);
		System.out.println("Attached an observer");
	}

	public void detach(Observer observer) {

		list.remove(observer);
	}

	public void nodifyObservers() {

		for (Observer observer : list) {
			/** 传对象通知改变 **/
			observer.update(this);
		}
	}
}
