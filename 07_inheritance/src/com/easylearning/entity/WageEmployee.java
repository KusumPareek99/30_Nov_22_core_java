package com.easylearning.entity;

public class WageEmployee extends Employee {
	
	public String company = "PSL";
	private double hours;
	private double rate;

	public WageEmployee() {
		super();
		System.out.println("default wageemp constructor called");
	}

	public WageEmployee(int id, String name, double salary, double hours, double rate) {
		super(id,name,salary);
		//System.out.println("parameterized wageemp constructor called");
		this.hours = hours;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double computeSalary() {
		return super.computeSalary()+rate*hours;
	}
	
	public double computeVariable() {
		return rate*hours;
	}
	
	public String getCompany() {
		return company;
	}
	
	//overriding
	public void display() {
		System.out.print("Wage Employee => ");
		super.display();
		System.out.println("hours="+hours+"  rate="+rate);
	}

	@Override
	public String toString() {
		return super.toString() +"   WageEmployee [company=" + company + ", hours=" + hours + ", rate=" + rate + "]";
	}
	
	
	

}
