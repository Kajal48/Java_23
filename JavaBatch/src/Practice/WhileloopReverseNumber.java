package Practice;   

import java.util.Scanner;

public class WhileloopReverseNumber {
	
	   public static void main(String[] args) {
	
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the value to reverse");
       int number = sc.nextInt();
       int rem = 0;
       int t;
       
       int reverseval = number;
       while(number>0) {
    	   t = number%10;
    	   rem = rem*10+t;
    	   number = number/10;
         }
	   System.out.println("The reversed value ---->"  + rem);
	   
//	   int reverseval = number;
	   if(reverseval==rem) {
		    
		   System.out.println("Hey, the value you have enter and the reverse value are same");
	   }
	   else {
		   
		   System.out.println("Hey, the value you have enter and the reverse value are not same");	
	   }      
	  sc.close(); 
}
   
}	   
