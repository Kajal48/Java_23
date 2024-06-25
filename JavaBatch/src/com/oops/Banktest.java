package com.oops;

public class Banktest {

	public static void main(String[] args) {
		
				SBI acc1 = new SBI("Kajal",887536847l,5000,887536847l);
				SBI acc2 = new SBI("Neha",7342,6000,8367456776l);
				SBI acc3 = new SBI("Priya",8457633347l,5,887536847l,6537);
			
				
				acc1.withdrawBalance(2000,9654676543l);
			    acc2.setpin(4556,9090);
			    acc3.deposit(8457633347l,3000,6537);
			    acc3.withdrawBalance(6537,8);
			}

	}
