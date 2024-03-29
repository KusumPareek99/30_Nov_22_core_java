package com.easylearning.entity;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address mailingAddress;
	private Address permanentAddress;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, Address mailingAddress, Address permanentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mailingAddress = mailingAddress;
		this.permanentAddress = permanentAddress;
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

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mailingAddress=" + mailingAddress
				+ ", permanentAddress=" + permanentAddress + "]";
	}

}
