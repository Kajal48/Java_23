package Practice;

import java.util.Scanner;

public class Arraylargestandsmallest {
	
	public static void main(String[] args)
	   {
	      int i;
	      int[] arr = new int[5];
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter 5 Numbers --> ");
	      
	      for(i=0; i<5; i++) {
	         arr[i] = sc.nextInt();
	      }//                          12 07 23 82 37
	      int large = arr[0];
	      for(i=1; i<5; i++)
	      {
	         if(large<arr[i])
	         {
	            large = arr[i];
	         }
	      }
	      System.out.println(" Largest Number = " +large);	 
	      
	      int small = arr[0];
	      for(i=1; i<5; i++)
	      {
	         if(small>arr[i])
	            small = arr[i];
	      }
	      
	      System.out.println(" Smallest Number = " +small);
	      }
 }
