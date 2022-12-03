package com.easylearning.main;

import com.easylearning.entity.Employee;

public class MarkterInterfaceDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//shallowcloningExample();
		deepCloningExample();
	}
	
	public static void deepCloningExample() throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1,"Jack",1000);
		Employee e2 = e1.clone();
		
		
		System.out.println(e1==e2);
		System.out.println("e1="+e1);
		System.out.println("e2="+e2);
		e1.setSalary(5000);
		
		Employee e3= e1.clone();
		
		System.out.println("e1="+e1);
		System.out.println("e2="+e2);
		System.out.println("e3="+e3);
		
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		
	}
	
	public static void shallowcloningExample() {
		Employee e1 = new Employee(1,"Jack",1000);
		//shallow cloning, deep cloning, almost deep cloning
		
		Employee e2 = e1; //shallow cloning
		
		System.out.println(e1==e2);
		System.out.println(e1);
		System.out.println(e2);
		e1.setSalary(5000);
		System.out.println(e1);
		System.out.println(e2);
	}

}
