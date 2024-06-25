package Practice;

import java.util.Scanner;

public class Reminderoftwonumbers {

	public static void main(String[] args) {

		int num1;
		int num2;
		int rem;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		num2 = sc.nextInt();		
		
		rem = num1 -(num1/num2) * num2;
		
		System.out.println(rem);	
	}
}
