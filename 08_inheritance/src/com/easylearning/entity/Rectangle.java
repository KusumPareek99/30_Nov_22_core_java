package com.easylearning.entity;

public class Rectangle extends Shape implements Printable {
	private double length;
	private double width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public void draw() {
		System.out.println("Rectanlge completed!!!!");

	}

	@Override
	public final double area() {
		return length * width;
	}

	@Override
	public final double perimeter() {
		return 2 * (length + width);
	}

	@Override
	public void print() {
		display();
	}

}
