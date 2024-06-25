package com.methods;

import java.util.Scanner;

public class StringArray {
	
	public static void main(String[] args) {
		
		String[] arr = new String[10];
		
	      System.out.println("Enter 10 Student names -----> ");
			/*
			 * arr[0] = "Raksha"; arr[1] = "Moni"; arr[2] = "Arpit"; arr[3] = "Neeraj";
			 * arr[4] = "Neena"; arr[5] = "Ravi"; arr[6] = "Abhishu"; arr[7] = "Oshi";
			 * arr[8] = "Raj"; arr[9] = "Sachin";
			 */
	     
	      int i;
	      Scanner sc = new Scanner(System.in);
	       
	      for(i=0; i<10; i++) {
	    	 
	    	  arr[i] = sc.next();    	  
	    	  //System.out.println(arr[i]); 
	      }
		
	}

}
