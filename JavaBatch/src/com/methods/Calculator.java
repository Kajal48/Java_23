package com.methods;

import java.util.Scanner;

public class Calculator {
	
	String brandname;
	int price ;
	String colour;
	
	void add() {
		
		int add;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number -->");
		int a = sc.nextInt();
		System.out.println("Please enter second number -->");
		int b = sc.nextInt();
		add = a+b;
		System.out.println("Addition ---> " +add);
	}	
	void table() {
		
		int number;
		System.out.println("Enter any number to print its table -->");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}
		
	void largestNumber() {
		
		  int i;
	      int[] arr = new int[5];
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter 5 Numbers --> ");
	      
	      for(i=0; i<5; i++) {
	         arr[i] = sc.nextInt();
	      }
	      int large = arr[0];
	      for(i=1; i<5; i++)
	      {
	         if(large<arr[i])
	         {
	            large = arr[i];
	         }
	      }
	      System.out.println(" Largest Number = " +large);	 
	}

	void smallestNumber() {
		
		  int i;
	      int[] arr = new int[5];
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter 5 Numbers --> ");
	      
	      for(i=0; i<5; i++) {
	         arr[i] = sc.nextInt();
	      }
		
		int small = arr[0];
	      for(i=1; i<5; i++)
	      {
	         if(small>arr[i])
	            small = arr[i];
	      }
	      
	      System.out.println(" Smallest Number = " +small);
	      }
	
}

