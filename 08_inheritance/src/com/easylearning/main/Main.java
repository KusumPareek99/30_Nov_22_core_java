package com.easylearning.main;

import com.easylearning.entity.Bike;
import com.easylearning.entity.Circle;
import com.easylearning.entity.Employee;
import com.easylearning.entity.Insurance;
import com.easylearning.entity.Rectangle;
import com.easylearning.entity.Shape;
import com.easylearning.entity.Square;

public class Main {
	
	public static void exampleOne() {
		//Shape shape = new Shape();  //cannot create object of abstract class
		
		Rectangle rectangle = new Rectangle(10,6);
		Square square = new Square(10);
		Circle circle = new Circle(10);
		
		displayDetailsOfShape(rectangle);
		displayDetailsOfShape(square);
		displayDetailsOfShape(circle);
		System.out.println(Insurance.MAX_PREMUIM_AMOUNT);
		
		Employee emp = new Employee(1, "Jack", 1000);
		Bike bike = new Bike();
		initiateInsurance(emp);
		initiateInsurance(bike);
	}
	
	public static void displayDetailsOfShape(Shape s) {
		s.display();
	}
	
	public static void initiateInsurance(Insurance insurance) {
		
		System.out.println("send sms");
		System.out.println("verification in progress.........");
		System.out.println("health check in progress...........");
		insurance.getInsuranced();
	}
	
	public static void main(String[] args) {
		exampleOne();
	}

}
