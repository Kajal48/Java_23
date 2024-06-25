package com.oops;

public class Testbuilding {
	
public static void main(String[] args) {
		
		Building returnvalue = Buildingmaker.makebuilding();
		
		System.out.println(returnvalue.buildingname);
		System.out.println(returnvalue.buildingfloors);
		System.out.println(returnvalue.buildingrooms);
		System.out.println(returnvalue.buildingaddress);
		System.out.println(returnvalue.buildingsize);
		System.out.println("---------------------->");
		
		Building returnvalue3 = Buildingmaker.makebuilding();
		System.out.println(returnvalue3.buildingaddress);
		
	}

}
