package com.oops;

public class Objectcreation {
	
	public static void main(String[] args) {
		
		// Student class objects
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.name = "Kajal";
		s1.rollno = 12;
		s1.fathername = "Ajit";
		s1.contactno = "9876543240";
		s1.address = "Noida";
		s1.schoolname = "City Montesory School";
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.fathername);
		System.out.println(s1.contactno);
		System.out.println(s1.address);
		System.out.println(s1.schoolname);
		System.out.println("***********************");
		System.out.println(s2.name);
		System.out.println(s3);
		System.out.println(s3.rollno);
		System.out.println("-----------------------------------");
		
		// Visitingcard class objects
		
		Visitingcard vc1 = new Visitingcard();
		Visitingcard vc2 = new Visitingcard();
		Visitingcard vc3 = new Visitingcard();
		
		vc1.name = "Priya";
		vc1.id = 8901;
		vc1.age = 25;
		vc1.designation = "Software Engineer";
		vc1.companyname = "TCS";
		
		System.out.println(vc1.name);
		System.out.println(vc1.id);
		System.out.println(vc1.age);
		System.out.println(vc1.designation);
		System.out.println(vc1.companyname);
		System.out.println("***********************");
		System.out.println(vc2.name);
		System.out.println(vc3);
		System.out.println(vc2.id);
		System.out.println("-----------------------------------");
		
		// Mobile class objects
		
		Mobile  m1 = new Mobile();
		Mobile  m2 = new Mobile();
		Mobile  m3 = new Mobile();
		
		m1.brand = "Redmi";
		m1.color = "Black";
		m1.modelname = "Note 8";
		m1.ramcapacity = 5000;
		m1.OStype = "Android";
		
		System.out.println(m1.brand);
		System.out.println(m1.color);
		System.out.println(m1.modelname);
		System.out.println(m1.ramcapacity);
		System.out.println(m1.OStype);
		System.out.println("***********************");
		System.out.println(m2.brand);
		System.out.println(m3);
		System.out.println(m3.OStype);
		System.out.println(m2.ramcapacity);	
		System.out.println("-----------------------------------");
		
		// Car class objects
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.cartype = "Sports car";
		c1.carmodel = "Toyota 86";		
		c1.color = "Black";
		c1.speed = 210;
		
		System.out.println(c1.cartype);
		System.out.println(c1.color);
		System.out.println(c1.carmodel);
		System.out.println(c1.speed);
		System.out.println("***********************");
		System.out.println(c2.color);
		System.out.println(c3);
		System.out.println(c2.speed);	
		System.out.println("-----------------------------------");	
		
	}

}
