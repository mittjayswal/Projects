package com.mitt.creational.singleton;

public class Singleton {

	private static Singleton singlton;
	
	public String testString;
	
	private Singleton() {
		testString = "This is Test String ";
	}
	
	public static Singleton getSingleton() {
		if (singlton == null) {
			synchronized (Singleton.class) {
				return new Singleton();
			}
		}
		return null;
	}
}
