package com.oops;

public class StudentMaker {
	
	public static Student makestudent() {
		
		//classname reference variable = new constuctor (classname());
		
		Student s1 = new Student();
		
		// to access properties(datamembers of the class) we will use this syntax--
		
		// referencevarible.propertyname;	
		s1.name = "kajal";
		s1.rollno = 5;
		s1.fathername = "Ajit";
		s1.address = "Noida";
		s1.contactno = "9876765656";
		s1.schoolname = "CMS";
		return s1;	
	
	}
	public static Student showstudent() {
		
		Student returnvalue2 = StudentMaker.makestudent();
		
		System.out.println(returnvalue2.name);
		System.out.println(returnvalue2.rollno);
		System.out.println(returnvalue2.fathername);
		System.out.println(returnvalue2.contactno);
		System.out.println(returnvalue2.address);
		System.out.println(returnvalue2.schoolname);
		return returnvalue2;	
	}
			
}

