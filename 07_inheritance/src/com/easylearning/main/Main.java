package com.easylearning.main;

import com.easylearning.entity.Employee;
import com.easylearning.entity.Manager;
import com.easylearning.entity.WageEmployee;

public class Main {
	public static void example1() {
		Employee emp1 = new Employee(1, "sam", 2000);
		System.out.println("net salary: " + emp1.computeSalary());
		System.out.println(emp1);
		printLine();

		WageEmployee we1 = new WageEmployee();
		System.out.println(we1);

		printLine();
		WageEmployee we2 = new WageEmployee(1, "John", 2000, 20, 10);
		// we2.display();
		System.out.println("net salary: " + we2.computeSalary());
		System.out.println("Variable pay: " + we2.computeVariable());
		System.out.println(we2);

	}

	public static void example2() {
		// parent/super class can refer to child class
		Employee we1 = new WageEmployee(1, "John", 2000, 20, 10);
		// Employee we1 = new Employee(1, "John", 2000);
		we1.display();
		System.out.println(we1.company); // no binding with instance variable
		System.out.println(we1.getCompany());
		System.out.println("variable: " + ((WageEmployee) we1).computeVariable());

		printLine();

		WageEmployee we2 = new WageEmployee(11, "Johny", 2000, 20, 20);
		we2.display();
		System.out.println(we2.company);
		System.out.println(we2.getCompany());
		System.out.println("variable: " + we2.computeVariable());

		// WageEmployee emp1 = new Employee(1, "sam", 2000); //subclass cannot refer to
		// super class

		printLine();
		Object ob = new WageEmployee();
		ob = new Main();
		ob = new Employee();
	}

	public static void example3() {
		Employee emp1 = new Employee(1, "Jack", 1000);
		WageEmployee emp2 = new WageEmployee(2, "jay", 2000, 100, 10);
		Manager emp3 = new Manager(3, "Jakie", 3000, 5, 500);

		// display the details
		// display net salary
		// if wageemp then variable amout if manager display bonus

		displayDetails(emp1);
		displayDetails(emp2);
		displayDetails(emp3);
	}

	public static void displayDetails(Employee emp) {
		System.out.println("-----------Details of " + emp.getClass() + "-----------------");
		System.out.println(emp);
		System.out.println("basicSalary: " + emp.getSalary());
		System.out.println("Net Salary: " + emp.computeSalary());
		if (emp instanceof WageEmployee) {
			System.out.println("Net variable: " + ((WageEmployee) emp).computeVariable());
		}
		if(emp instanceof Manager) {
			System.out.println("Bonus: "+ ((Manager)emp).computeBonus());
		}
		System.out.println("______________________________________________\n");
	}

	public static void main(String[] args) {
		example3();
	}

	public static void printLine() {
		System.out.println("\n___________________________________________________________\n");
	}

}
