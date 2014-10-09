package com.model.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> list = new ArrayList<Observer>();

	public void attach(Observer observer) {

		list.add(observer);
	}

	public void detach(Observer observer) {

		list.remove(observer);
	}

	public void notifyObservers(String state) {

		for (Observer observer : list) {
			observer.update(state);
		}
	}
}
