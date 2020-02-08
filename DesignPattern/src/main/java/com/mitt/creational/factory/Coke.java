package com.mitt.creational.factory;

public abstract class Coke {
	
	int price;
	
	abstract int getPrice();
	
	void calculateRate(int numberOfBottle) {
		System.out.println("Price of the bottle "+numberOfBottle + " is -> "+(numberOfBottle*price));
	}
	

}
