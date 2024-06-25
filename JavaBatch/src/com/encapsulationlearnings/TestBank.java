package com.encapsulationlearnings;

public class TestBank {
	
	public static void main(String[] args) {
		
	SBI acc1 = new SBI("Kajal",887536847l,20000,9876457388l,6537);
	SBI acc2 = new SBI ("Neha",7342,6000,8367456776l);
	SBI acc3 = new SBI ("Priya",8457633347l,5000,887536847l,6537);

	
	acc1.withdrawBalance(2000,9876457388l);
	acc1.setpin(6537,4556);
	acc1.deposit(887536847l,3000,6537);
	acc2.withdrawBalance(9000,8367456776l);
	acc2.getpin(9876457388l);
	acc3.deposit(8457633347l,3000,6537);
    acc3.getbalance(6537);
    
}

}
