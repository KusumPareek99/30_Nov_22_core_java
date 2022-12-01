package com.easylearning.main;

import com.easylearning.entity.Address;

public class GCExample {
	
	public static void main(String[] args) {
		Address add1 = new Address("pune", 411021);
		add1 = new Address("Nashik", 123456);
		//System.gc();
		
		for(int i=0;i<999999;i++) {
			add1 = new Address("Nashik", i);
		}
		System.out.println(add1);
	}

}
