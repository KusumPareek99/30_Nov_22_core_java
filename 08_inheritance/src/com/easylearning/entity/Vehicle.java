package com.easylearning.entity;

public class Vehicle {
	
	public void start() {
		System.out.println("vehicle start");
	}
	public void stop() {
		System.out.println("vehicle stop");
	}
	
	public final void display() {
		System.out.println("I am vehicle=>"+this.getClass());
	}
	


}
