package com.oops;

public class Teststudent {

	public static void main(String[] args) {

		Student returnvalue = StudentMaker.makestudent();

		System.out.println(returnvalue.name);
		System.out.println(returnvalue.rollno);
		System.out.println(returnvalue.fathername);
		System.out.println(returnvalue.contactno);
		System.out.println(returnvalue.address);
		System.out.println(returnvalue.schoolname);
		System.out.println("---------------------->");

		Student returnvalue3 = StudentMaker.showstudent();

		  System.out.println(returnvalue3.rollno);
		  System.out.println(returnvalue3.fathername);

	}

}
