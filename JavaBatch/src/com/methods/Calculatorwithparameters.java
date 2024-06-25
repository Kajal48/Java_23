package com.methods;

import java.util.Scanner;

public class Calculatorwithparameters {
	
	String brandname;
	int price ;
	
	int add(){
	int add;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter any to digits : -  ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	add = a + b;
	System.out.println(add);
	return add;
	}
	int sub(){
	int sub;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter any to digits : -  ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	sub = a - b;
	System.out.println(sub);
	return sub;
	}
	int mul(){
	int mul;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter any to digits : -  ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	mul = a * b;
	System.out.println(mul);
	return mul;
	}
	int div(){
	int div;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter any to digits : -  ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	div = a / b;
	System.out.println(div);
	return div;
    }
	
	Demo printvalue(int add, int sub, int mul, int div) {
		
		System.out.println("Outputs ------------>");
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		Demo d1 = new Demo();
		d1.addedvalue = add;
		d1.substractedvalue = sub;
		d1.multipliedvalue = mul;
		d1.dividedvalue = div;
		d1.name = "Kajal";
		d1.abc = 'a';
		return d1;
		
	}	
}
