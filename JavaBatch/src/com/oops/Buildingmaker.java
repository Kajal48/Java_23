package com.oops;

public class Buildingmaker {
	
	public static Building makebuilding() {

		Building building = new Building();
	
		building.buildingname = "Prateek Fedora";
		building.buildingfloors = 5;
		building.buildingrooms = 10;
		building.buildingaddress = "Noida";
		building.buildingsize = "10000";
		return building;	
	
	}
	public static Building showbuilding() {
		
		Building returnvalue2 = Buildingmaker.makebuilding();
		
		System.out.println(returnvalue2.buildingname);
		System.out.println(returnvalue2.buildingfloors);
		System.out.println(returnvalue2.buildingrooms);
		System.out.println(returnvalue2.buildingaddress);
		System.out.println(returnvalue2.buildingsize);
		return returnvalue2;	
	}
			

}
