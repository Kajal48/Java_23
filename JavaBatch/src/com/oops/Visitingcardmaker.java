package com.oops;

public class Visitingcardmaker {
	
	public static Visitingcard makevisitingcard() {

		Visitingcard vc1 = new Visitingcard();
	
		vc1.name = "Prateek Fedora";
		vc1.id = 5;
		vc1.age = 10;
		vc1.designation = "Noida";
		vc1.companyname = "10000";
		return vc1;	
	
	}
	public static Visitingcard showvisitingcar() {
		
		Visitingcard returnvalue2 = Visitingcardmaker.makevisitingcard();
		
		System.out.println(returnvalue2.name);
		System.out.println(returnvalue2.id);
		System.out.println(returnvalue2.age);
		System.out.println(returnvalue2.designation);
		System.out.println(returnvalue2.companyname);
		return returnvalue2;	
	}
			

}
