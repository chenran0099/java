package com.enumtest;


public class TrafficLight {

	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case RED:
			color = Signal.GREEN;
			break;
		}
	}

	@Override
	public String toString() {
		return "The traffic light is " + color;
	}

	public static void main(String[] args) {

		TrafficLight trafficLight = new TrafficLight();

		for (int i = 0; i < 7; i++) {
			System.out.println(trafficLight);
			trafficLight.change();
		}

	}

}
