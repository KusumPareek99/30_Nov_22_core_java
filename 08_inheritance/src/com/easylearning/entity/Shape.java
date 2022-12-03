package com.easylearning.entity;

public abstract class Shape {

	int a;

	public Shape() {
		System.out.println("shape default constructor called...");
	}

	public Shape(int a) {
		super();
		this.a = a;
	}

	public abstract void draw();

	public abstract double area();

	public abstract double perimeter();

	public void display() {
		System.out.println("---------------shape =>" + this.getClass() + "------------------");
		System.out.println(this);
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
		System.out.println("a=" + a);
		// System.out.println("________________________________________________________________________");
	}

	public static void foo() {
		System.out.println("static method is allowed in abstract class");
	}

	public void setA(int a) {
		this.a = a;
	}
}
