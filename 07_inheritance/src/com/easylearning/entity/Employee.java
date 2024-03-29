package com.easylearning.entity;

import java.util.Objects;

public class Employee {
	public String company = "Zensar";
	private int id;
	private String name;
	private double salary;

	public Employee() {
		super();
		System.out.println("default emp constructor");
	}

	public Employee(int id, String name, double salary) {
		// System.out.println("parameterized emp constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double computeSalary() {
		return salary;
	}

	public String getCompany() {
		return company;
	}

	public void display() {
		System.out.println("Employee => id=" + getId() + " Name=" + getName() + "  salary= " + getSalary());
	}
	
	@Override
	public String toString() {
		return "Employee => id=" + getId() + " Name=" + getName() + "  salary= " + getSalary();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	


}
