package com.easylearning.entity;

public class Manager extends Employee {

	private int noOfSubordinate;
	private double bonus;

	public Manager() {
	}

	public Manager(int id, String name, double salary, int noOfsubordinate, int bonus) {
		super(id, name, salary);
		this.noOfSubordinate = noOfsubordinate;
		this.bonus = bonus;
	}

	public int getNoOfSubordinate() {
		return noOfSubordinate;
	}

	public void setNoOfSubordinate(int noOfSubordinate) {
		this.noOfSubordinate = noOfSubordinate;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "     Manager [noOfSubordinate=" + noOfSubordinate + ", bonus=" + bonus + "]";
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + bonus * noOfSubordinate;
	}

	public double computeBonus() {
		return bonus * noOfSubordinate;
	}

}
