package com.methods;

public class Usecalculator {

	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		calc.brandname = "Casio";
		calc.colour = "Black";
		calc.price = 2000;
		
		System.out.println(calc.brandname);
		System.out.println(calc.colour);
		System.out.println(calc.price);
		
		calc.add();
		calc.table();
		calc.largestNumber();
		calc.smallestNumber();

	}

}
