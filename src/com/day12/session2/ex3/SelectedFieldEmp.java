package com.day12.session2.ex3;

public class SelectedFieldEmp {
	private String name;
	private double salary;
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
	public SelectedFieldEmp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SelectedFieldEmp [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
