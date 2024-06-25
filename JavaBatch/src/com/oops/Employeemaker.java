package com.oops;

public class Employeemaker {
	
public static Employee makeemployee() {

		Employee emp1 = new Employee();
	
		emp1.empname = "kajal";
		emp1.empid = 8902;
		emp1.empposition = "Software Engineer";
		emp1.address = "Noida";
		emp1.phoneno = "9876765656";
		return emp1;	
	
	}
	public static Employee showemployee() {
		
		Employee returnvalue2 = Employeemaker.makeemployee();
		
		System.out.println(returnvalue2.empname);
		System.out.println(returnvalue2.empid);
		System.out.println(returnvalue2.empposition);
		System.out.println(returnvalue2.address);
		System.out.println(returnvalue2.phoneno);
		return returnvalue2;	
	}
			

}
