package com.encapsulationlearnings;

public class SBI extends Bank {
	
	public String bankname = "SBI Bank";

	
	public SBI(String accountHolderName, long accountNumber, int balance, int pin) {
		super(accountHolderName, accountNumber, balance, pin);

	}

	public SBI(String accountHolderName,int pin,int balance,long accountNumber) {
		
		super( accountHolderName, pin, balance,accountNumber);

	}
	
	public SBI(String accountHolderName,long accountNumber,int balance,long mobileNumber,int pin) {
		
		super(accountHolderName,accountNumber,balance,mobileNumber,pin);
			
	}
	
}
