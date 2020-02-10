package com.mitt.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mitt.creational.abstractfactory.AbstractFactory;
import com.mitt.creational.abstractfactory.Animal;
import com.mitt.creational.abstractfactory.AnimalFactory;
import com.mitt.creational.abstractfactory.FactoryProvider;
import com.mitt.creational.builder.Game;
import com.mitt.creational.builder.Game.GameBuilder;
import com.mitt.creational.prototype.Employee;
import com.mitt.creational.singleton.Singleton;

public class UserForCreational {

	@Test
	public void testAbstractFactory() {
		FactoryProvider provider = new FactoryProvider();
		
		AbstractFactory abstractFactory = provider.getFactory("Animal Factory");
		
		Assert.assertEquals((abstractFactory instanceof AnimalFactory), true);
		
		Animal animal = (Animal) abstractFactory.create("Dog");
		
		System.out.println(animal.makeSound());
		
	}
	
	@Test
	public void testSingleton() {
		Singleton object1 = Singleton.getSingleton();
		
		Singleton object2 = Singleton.getSingleton();
		
		Singleton object3 = Singleton.getSingleton();
		
		System.out.println(object1.testString.toUpperCase());
		
		Assert.assertEquals(object1.testString, object2.testString);
		
		System.out.println(object3.testString.toLowerCase());
		
		Assert.assertEquals(object3.testString, object2.testString);
		
	}
	
	@Test
	public void testPrototype() {
		Employee emp1 = new Employee("Mitt", "123");
		emp1.printRecord();
		
		Employee emp2 = (Employee) emp1.getClone();
		emp2.printRecord();
		
		Assert.assertEquals(emp1.getName(), emp2.getName());
	}
	
	@Test
	public void testBuilderPattern() {
		Game game = new GameBuilder()
				.homeTeam("Texas")
				.awayTeam("SF")
				.currentYardLine(20)
				.stadium("Super")
				.weather("nice")
				.build();
		
		Assert.assertEquals(game.getHomeTeam(), "Texas");
		Assert.assertEquals(game.getAwayTeam(), "SF");
		Assert.assertEquals(game.getCurrentYardLine(), 20);
		Assert.assertEquals(game.getWeather(), "nice");
	}
}
