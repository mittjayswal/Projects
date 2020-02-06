package com.mitt.factory;

public class CokeFactory {

	Coke object;
	
	public Coke getCoke(String name) {
		
		if (name == null) {
			return null;
		}
		
		else if (name.equals("DietCoke")) {
			return new DietCoke();
		}
		else if (name.equals("RegularCoke")) {
			return new RegularCoke();
		}
		return null;
		
	}
}
