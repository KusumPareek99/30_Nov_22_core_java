package com.easylearning.main;

import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Address mailingAdd1 = new Address("Pune", 411041);
		Address permAddress1 = new Address("Bhopal", 411041);
		
		Employee emp1 = new Employee(1, "Jack", 1000, mailingAdd1, permAddress1);
		System.out.println(emp1);
		
		Employee emp2 = new Employee(1, "Jack", 1000);
		//emp2.setMailingAddress(mailingAdd1);
		//emp2.setPermanentAddress(mailingAdd1);
		
		System.out.println(emp2);

	}

}
