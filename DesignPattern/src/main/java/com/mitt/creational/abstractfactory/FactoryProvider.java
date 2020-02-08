package com.mitt.creational.abstractfactory;

public class FactoryProvider {

	 public AbstractFactory getFactory (String factoryName){
		if (factoryName == null) {
			return null;
		}else if (factoryName.equalsIgnoreCase("Animal Factory")) {
			return new  AnimalFactory();
		}else if (factoryName.equalsIgnoreCase("car Factory")) {
			return new CarFactory();
		}
		return null;
	}
}
