package com.oops;

public class Testemployee {
	
public static void main(String[] args) {
		
		Employee returnvalue = Employeemaker.showemployee();
		
		System.out.println(returnvalue.empname);
		System.out.println(returnvalue.empid);
		System.out.println(returnvalue.empposition);
		System.out.println(returnvalue.address);
		System.out.println(returnvalue.phoneno);
		System.out.println("---------------------->");
		
		Employee returnvalue3 = Employeemaker.showemployee();
		
		System.out.println(returnvalue3.phoneno);
	}
	
}
