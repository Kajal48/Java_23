package com.encapsulationlearnings;

public class Bank {
	
	public String accountHolderName;
	public long accountNumber;
	private int balance;
	public long mobileNumber;
	private int pin;
	public  int counter=0;
	
	
	public Bank(String accountHolderName, long accountNumber, int balance, long mobileNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.mobileNumber = mobileNumber;
		//this.pin = pin;
	}

	public Bank(String accountHolderName, long accountNumber, int balance, int pin) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public Bank(String accountHolderName, long accountNumber, int balance,long mobileNumber, int pin) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.mobileNumber = mobileNumber;
		this.pin = pin;

	}
	
	public void getpin(long mobileNumber) {
		if(this.mobileNumber==mobileNumber)
		{
			
			System.out.println(this.pin);
		}
		
		else {
			
			System.out.println("Incorrect mobile number");
		}
		
	}
	
	public void setpin(int oldpin,int newpin) {
		if(counter<3) {
			if(oldpin==this.pin) {
				
			this.pin=newpin;	
			System.out.println(accountHolderName + " Your pin has been updated " + pin);
			counter=0;
			
			}
			
			else {
				
				System.out.println("Incorrect pin");
			}
					
		}
		else {
			counter++;
		    System.out.println("Please try after 48 hours");
					
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
	
	public void getbalance(int pin) {
	if(counter<3) {
	
	if(this.pin==pin)
	{
		
		System.out.println("Your account balance is  " + this.balance);
		counter=0;
	}
	
	else {
		
		counter++;
		System.out.println("Incorrect pin entered");
	}
				
		}
	}
	
	public void getbalance(long mobileNumber) {
		
		if(this.mobileNumber==mobileNumber)
		{
			
			System.out.println("Your account balance is  " + this.balance);
		}
		
		else {
			
			System.out.println("Incorrect mobile number entered");
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
	
	public void withdrawBalance(int amount,long mobileNumber ) {
		if(counter<3) {
			if(this.mobileNumber==mobileNumber) {
				if(this.balance>=amount) {
					this.balance = this.balance-amount;
					System.out.println("Amount of balance " + amount + " is debited ");
					System.out.println(accountHolderName + " " + "Your current balance is " + this.balance);
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
	
	public void deposit( long accountNumber,int amount,int pin) {
		if(counter<3)
		{
			if(this.accountNumber==accountNumber) {
				
				this.balance = balance+amount;
				System.out.println(accountHolderName +" " + "Your account has been credited with " + amount + " and updated balance is " + this.balance);
				counter=0;
			}
			else
			{
				
				System.out.println("The account number you have enterted is incorrect");		
			}
			
		}
		
		else {
			counter++;
			System.out.println(accountHolderName + " " + "Your account is blocked please generate new the pin");
			
		}
		
			}

}
