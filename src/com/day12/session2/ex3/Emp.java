package com.day12.session2.ex3;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private double salary;
	private String address;
	private Dept dept;

	public Emp() {} 
	

	public Emp(int id, String name, double salary, String address, Dept dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", address=" + address + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Emp o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
}




