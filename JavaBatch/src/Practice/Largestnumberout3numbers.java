package Practice;

import java.util.Scanner;

public class Largestnumberout3numbers {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int largenum = 0;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please enter first number");
		a = sc.nextInt();
		System.out.println("Please enter second number");
		b = sc.nextInt();
		System.out.println("Please enter third number");
		c = sc.nextInt();
		
				if (a > b | a > c) {
					largenum = a;
				}   
				if (b > a | b > c){
					largenum = b;
				}
				if (c > a | c > b){
					largenum = c;
				}
				System.out.println(largenum);
	}
}
