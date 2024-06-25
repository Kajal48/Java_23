package Practice;

import java.util.Scanner;

public class StaticCalculator {

	public static void main(String[] args) {

		System.out.println("We are inside main method");
		int[] arr = new int[4];
		arr[0] = StaticCalculator.add();
		arr[1] = StaticCalculator.sub();
		arr[2] = StaticCalculator.mul();
		arr[3] = StaticCalculator.div();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		} //    12 07 23 37
		 int large = arr[0];
	      for(int i=1; i<arr.length; i++)
	      {
	         if(large<arr[i])
	         {
	            large = arr[i];
	         }
	      }
	      System.out.println(" Largest Number = " +large);	 
	      
	      int small = arr[0];
	      for(int i=1; i<arr.length; i++)
	      {
	         if(small>arr[i])
	            small = arr[i];
	      }
	      System.out.println(" Smallest Number = " +small);
	      }		
		public static int add()
		{
		int add;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any to digits : -  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add = a + b;
		System.out.println(add);
		return add;
		}
		public static int sub()
		{
		int sub;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any to digits : -  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sub = a - b;
		System.out.println(sub);
		return sub;
		}
		public static int mul()
		{
		int mul;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any to digits : -  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		mul = a * b;
		System.out.println(mul);
		return mul;
		}
		public static int div()
		{
		int div;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter any to digits : -  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		div = a / b;
		System.out.println(div);
		return div;
}
}
