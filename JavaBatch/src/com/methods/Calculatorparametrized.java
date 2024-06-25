package com.methods;

public class Calculatorparametrized {

	public static void main(String[] args) {

		Calculatorwithparameters c1 = new Calculatorwithparameters();
		c1.brandname = "Casio";
		c1.price = 2000;
		
		int sum = c1.add();
		int difference = c1.sub();
		int multiply = c1.mul();
		int divide = c1.div();
		
		
		Demo d2 = c1.printvalue(sum, difference, multiply, divide);
	

	}

}
