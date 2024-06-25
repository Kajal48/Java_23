package com.methods;

public class StudentRoutine {

	public static void main(String[] args) {
	
			Student1 s1 = new Student1();
			s1.name = "Rahul";
			
			System.out.println(s1.name);
			System.out.println("-----------------------------------");
			
			s1.wakeup();
			s1.freshenup();
			s1.eatingbreakfast();
			s1.gotoschool();
			s1.returnfromschool();
			s1.lunch();
			s1.sleep();
			s1.wakeupandplay();
			s1.studying();
			s1.dinner();
			s1.Gotosleep();
			
			Student1 s2 = new Student1();
			s2.name = "Kajal";
			
			System.out.println(s2.name);
			System.out.println("-----------------------------------");
			
			s2.wakeup();
			s2.gotoschool();
			s2.lunch();
			s2.sleep();
			s2.videogame();
			s2.dinner();
			s2.Gotosleep();		
	}		
}
	
