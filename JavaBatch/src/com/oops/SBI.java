package com.oops;

	public class SBI extends Bank{
		
		public String bankname = "SBI Bank";
		//private int pin;
		
		
		public SBI(String accountHolderName,long accountNumber,int balance,long mobileNumber) {
			super(accountHolderName,accountNumber,balance,mobileNumber);
		
			//this.pin = pin;
		}
		
		public SBI(String accountHolderName,int pin,int balance,long accountNumber) {
			
			super( accountHolderName, pin, balance,accountNumber);
		//	this.bankname = bankname;
		}
		
		public SBI(String accountHolderName,long accountNumber,int balance,long mobileNumber,int pin) {
			
			super(accountHolderName,accountNumber,balance,mobileNumber,pin);
			
			
		}
		
		
		

	}
