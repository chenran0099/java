package com.model.onserver2;

public interface Observer {
	
	/** 拉模型是直接传对象的 **/
	public void update(Subject subject);
}
