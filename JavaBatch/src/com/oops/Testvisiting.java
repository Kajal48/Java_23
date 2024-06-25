package com.oops;

public class Testvisiting {
	
public static void main(String[] args) {
		
		Visitingcard returnvalue = Visitingcardmaker.makevisitingcard();
		
		System.out.println(returnvalue.name);
		System.out.println(returnvalue.id);
		System.out.println(returnvalue.age);
		System.out.println(returnvalue.designation);
		System.out.println(returnvalue.companyname);
		System.out.println("---------------------->");
		
		Visitingcard returnvalue3 = Visitingcardmaker.makevisitingcard();
		System.out.println(returnvalue3.designation);
		
	}

}
