package com.methods;

public class Account {
	
		 long accountno;
	     int oldpin;
	     String accountholdername;
	     int balance;
	     
	     
	     void moneywithdraw(int newpin, int withdrawamount){
	    
	    	 if (newpin==oldpin) {
	    		 
	    		 System.out.println("Your entered pin number is correct");

	    		 if (withdrawamount<=balance) {
	    			 
	    			 int newbalance = balance - withdrawamount;
	    			 System.out.println("Withdrawal successful! Please collect your money.");
	    			 System.out.println("Now your balance is = " + newbalance );
	    			 
	    		 }
	    		 else {
	    			 
	    			 System.out.println("You have insufficient balance");
	    		 }
	    	 }
	    	 else {
	    		 
	    		 System.out.println("Your entered pin number is wrong");
	    		 
	    		  }
	    	 
	     }    
	     
	     void moneydeposit(long acoountnum, int depositamount ) {
	    	 
	        	 if (acoountnum==accountno) {
	        		 
	        		 System.out.println("Your entered account no. is correct");

	        		 int newbalance = balance + depositamount;
	        		 System.out.println("deposit successful! Thankyou.");
	        		 System.out.println("Now your balance is = " + newbalance );
	        	 }
	        	 
	        	 else {
	        		 
	        		 System.out.println("Your account number does not exist");
	        		 
	        		  }
	         }
	     
}
