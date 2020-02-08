package com.mitt.creational.abstractfactory;

public class CarFactory implements AbstractFactory<Car> {

	public Car create(String type) {
		
		if (type == null) {
			return null;
		}else if (type.equalsIgnoreCase("Ford")) {
			return new Ford();
		}
		return null; 
	}
	
}
