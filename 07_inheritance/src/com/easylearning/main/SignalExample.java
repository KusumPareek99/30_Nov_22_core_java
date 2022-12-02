package com.easylearning.main;

import com.easylearning.entity.Bike;
import com.easylearning.entity.Car;
import com.easylearning.entity.Jeep;
import com.easylearning.entity.Truck;
import com.easylearning.entity.Vehicle;

public class SignalExample {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		Car car = new Car();
		Truck truck = new Truck();
		Jeep jeep = new Jeep();
		
		signal(bike,"green");
		signal(car, "red");
		signal(truck,"green");
		signal(jeep,"green");
		signal(jeep,"red");
		
		car.display();
		jeep.display();
		
	}
	
	public static void signal(Vehicle vehicle,String color) {
		switch(color) {
		case "red" : vehicle.stop();break;
		case "green" : vehicle.start();break;
		}
	}


}
