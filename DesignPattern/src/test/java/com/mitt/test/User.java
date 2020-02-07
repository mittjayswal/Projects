package com.mitt.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mitt.abstractfactory.AbstractFactory;
import com.mitt.abstractfactory.Animal;
import com.mitt.abstractfactory.AnimalFactory;
import com.mitt.abstractfactory.FactoryProvider;

public class User {

	@Test
	public void testAbstractFactory() {
		FactoryProvider provider = new FactoryProvider();
		
		AbstractFactory abstractFactory = provider.getFactory("Animal Factory");
		
		Assert.assertEquals((abstractFactory instanceof AnimalFactory), true);
		
		Animal animal = (Animal) abstractFactory.create("Dog");
		
		System.out.println(animal.makeSound());
		
	}
}
