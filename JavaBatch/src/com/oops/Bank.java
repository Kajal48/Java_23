package com.oops;

public class Bank {
	
	public String accountHolderName;
	public long accountNumber;
	private int balance;
	private int pin;
	public  int counter=0;
	public long mobileNumber;
	
	public Bank(String accountHolderName,long accountNumber,int balance,long mobileNumber) {
		
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.mobileNumber =  mobileNumber;
	//this.pin = pin;	

	}
	
	public Bank(String accountHolderName,int pin,int balance,long accountNumber) {
	
	this.accountHolderName = accountHolderName;
	this.pin = pin;	
	this.balance = balance;	
	this.accountNumber = accountNumber;
	}
	
	public Bank(String accountHolderName,long accountNumber,int balance,long mobileNumber,int pin) {
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.mobileNumber =  mobileNumber;
		this.pin = pin;
		
	}
	
	public void withdrawBalance(int amount,long mobileNumber ) {
		if(counter<3) {
			if(this.mobileNumber==mobileNumber) {
				if(this.balance>=amount) {
					this.balance = this.balance-amount;
					System.out.println("amount of balance" + amount + "is debited");
					System.out.println(accountHolderName + " " + "your current balance is " + this.balance);
					counter=0;

				}			
				else {
					
					System.out.println("Sorry you have insufficient balance");	

				}				
			}		
			else {
				counter++;
				System.out.println("Mobile number is incorrect");				
			}			
		}	
		else {
			System.out.println(accountHolderName +" " +  "Your account is block. Please unlock by generating new pin");
					
		}
					
	}
	
	public void setpin(long mobileNumber,int pin) {
		if(counter<3) {
			if(this.mobileNumber==mobileNumber) {
				
				this.pin=pin;
				System.out.println("your pin has been genreated" + pin);
                counter=0;
			}
			else {
				System.out.println("Mobile number is incorrect");
				
			}
		}
			else {
				counter++;
				System.out.println("please try after 48 hours");
			
			}		
	}
	
	public void setpin(int oldpin,int newpin) {
		if(counter<3) {
			if(oldpin==this.pin) {
				
			this.pin=newpin;	
			System.out.println(accountHolderName + "your pin has been updated" + pin);
			counter=0;
			
			}
			
			else {
				
				System.out.println("incorrect pin");
			}
					
		}
		else {
			counter++;
		    System.out.println("please try after 48 hours");
					
		}		
		
	}
	
	public void withdrawBalance(int pin,int amount) {
		
		if(counter<3) {
			if(this.pin==pin) {
				if(this.balance>=amount) {
					this.balance = this.balance-amount;
					System.out.println("amount of balance " + amount + " is debited");
					System.out.println(accountHolderName + " " + "your current balance is " + this.balance);
					counter=0;
				}			
				else {
					
					System.out.println("Sorry insufficient balance");	
				}				
			}		
			else {
				counter++;
				System.out.println("pin is incorrect");				
			}			
		}	
		else {
			
			System.out.println(accountHolderName + " " +  "Your account is block. Please unlock by generating new pin");
					
		}
		
	}
	
	public void showBalance(long mobileNumber) {
		if(counter<3) {
			if(this.mobileNumber==mobileNumber) {
				
				System.out.println("your current balance is " + balance);
		        counter=0;
			}
			else {

				  System.out.println("incorrect mobile number");
				  
			}
		}
		else {
			
			  counter++;
			  System.out.println(accountHolderName + " " + "your account is blocked please enter right mobile number");
	
		}
		
	}
	
	
	public void showBalance(int pin) {
		if(counter<3) {
			if(this.pin==pin) {
				
				System.out.println(accountHolderName +" " +  "your current balance is " + balance);
		        counter=0;
			}
			else {
				
				  System.out.println("incorrect pin");
				
			}
			
		}
		else {
			
			  counter++;
			  System.out.println(accountHolderName +" " + "your account is blocked please change the pin");
	
		}
		
	}

	
	public void deposit( long accountNumber,int amount,int pin) {
		if(counter<3)
		{
			if(this.accountNumber==accountNumber) {
				
				this.balance = balance+amount;
				System.out.println(accountHolderName +" " + "your account has been creatited with " + amount + " and updated balance is " + this.balance);
				counter=0;
			}
			else
			{
				
				System.out.println("which acount number you have enterted is incorrect");		
			}
			
		}
		
		else {
			counter++;
			System.out.println(accountHolderName + " " + "your account is blocked please change the pin");
			
		}
		
			}
	
	
    public void showDeatil(int pin) {
    	if(counter<3) {
         if(this.pin==pin) {
        	 
 			System.out.println("All account details");
 			
 			System.out.println("Name of accountholder:" + accountHolderName);
 			System.out.println("Account number:" + accountNumber );
 			System.out.println("Balance:" + balance);
 			System.out.println("Mobilenumber:" + mobileNumber);
 			//System.out.println("Bankname:" + bankname);
            counter=0;
        	   	 
         }
         else {
        	 
  			System.out.println("incorrect pin");
        	 
         }
    	
    	}
    	
    	else {
    		
    		counter++;
			System.out.println(accountHolderName + " " + "your account is blocked please change the pin");
			    		
    	}
    
    }

}

