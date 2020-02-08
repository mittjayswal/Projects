package com.mitt.creational.factory;

public class User {

	public static void main(String[] args) {
		CokeFactory factoryObject = new CokeFactory();
		
		Coke coke = factoryObject.getCoke("DietCoke");
		System.out.println(coke.getPrice());
		coke.calculateRate(10);
		
	}
}
