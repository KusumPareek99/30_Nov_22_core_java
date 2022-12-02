package com.easylearning.main;

import com.easylearning.entity.Parent;

public class AccessSpecifierExample {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.d);
		
		Child child = new Child();
		System.out.println(child.d);
	}

}
