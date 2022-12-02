package com.easylearning.main;

import com.easylearning.entity.Employee;

public class EqualAndHashCodeExample {
	
	public static void main(String[] args) {
		int a=10;
		int b=10;
		System.out.println(a==b);
		
		Employee e1 = new Employee(1, "Jack", 1000);
		Employee e2 = new Employee(1, "Jack", 10001);
		System.out.println(e1==e2);
		
		boolean equal = e1.equals(new EqualAndHashCodeExample());
		System.out.println(equal);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
