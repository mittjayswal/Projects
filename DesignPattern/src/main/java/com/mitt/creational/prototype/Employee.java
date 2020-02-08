package com.mitt.creational.prototype;

public class Employee implements EmployeePrototype{

	String name;
	String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Employee(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public void printRecord() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee phone number is "+name);
	}
	public EmployeePrototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(name, phone);
	}

}
