package com.methods;

public class TestAcoount {

	public static void main(String[] args) {
	
		Account acc = new Account();
		acc.accountholdername = "Kajal";
		acc.accountno = 1234567890;
		acc.oldpin = 1234;
		acc.balance = 10000;
		
		System.out.println(acc.accountholdername);
		System.out.println(acc.accountno);
		System.out.println(acc.oldpin);
		System.out.println(acc.balance);
		System.out.println("------------------>>>>>>>");	
		
		acc.moneywithdraw(1234, 5000);
		acc.moneydeposit(1234567890, 4000);
		
	}

}
