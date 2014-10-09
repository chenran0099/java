package com.thinkinjava.multiplexing;

// 代理模式 同时暴漏对象实例和方法(java语言不支持，需要自己实现)
public class SpaceShipDelegation {

	private String name;

	private SpaceShipControls controls = new SpaceShipControls();

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	// 代理方法
	public void up(int velocity) {
		controls.up(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void forward(int velocity) {
		controls.forward(velocity);
	}

	public void back(int velocity) {
		controls.back(velocity);
	}

	public void turboBoost(int velocity) {
		controls.turboBoost(velocity);
	}

	public static void main(String[] args) {
		SpaceShipDelegation delegation = new SpaceShipDelegation("NESA Protector");
		delegation.forward(100);
	}
}
