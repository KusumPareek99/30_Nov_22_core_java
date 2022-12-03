package com.easylearning.entity;

public class Circle extends Shape {
	private double radius;
	private static final double PI = 3.14;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super(100);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("circle completed!!!");

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}

}
