package com.easylearning.entity;

public class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("car start");
	}
	
	public void stop() {
		System.out.println("car stop");
	}
	
	public void test() {}
	

}
