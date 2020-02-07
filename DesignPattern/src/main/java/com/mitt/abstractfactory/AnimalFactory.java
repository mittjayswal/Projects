package com.mitt.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

	public Animal create(String animalType) {
		if (animalType == null) {
			return null;
		}else if (animalType.equalsIgnoreCase("Dog")) {
			return new Dog();
		}else if (animalType.equalsIgnoreCase("Car")) {
			return new Cat();
		}
		return null;
	}
}
