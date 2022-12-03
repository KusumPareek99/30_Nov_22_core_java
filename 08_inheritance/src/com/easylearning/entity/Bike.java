package com.easylearning.entity;

public class Bike extends Vehicle implements Insurance, Printable {

	public void start() {
		System.out.println("bike start");
	}

	public void stop() {
		System.out.println("bike stop");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInsuranced() {
		// TODO Auto-generated method stub

	}
}
