package com.easylearning.entity;

public class Square extends Rectangle {
	private double side;

	public Square() {
	}

	public Square(double side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Square completed....");
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
