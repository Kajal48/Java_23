package Practice;
import java.util.Scanner;

public class NestedIfelse {
	
	public static void main(String[] args) {
		
		int oldpin = 1234;
		int Balance = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 4 digit ATM pin");
		int pin = sc.nextInt();
		
		if(pin==oldpin) {
			
			System.out.println("What do to next ->");
			System.out.println("Enter 0 for Mini Statement");
			System.out.println("Enter 1 for Withdrawl");
			System.out.println("Enter 2 for Pin Change");
			System.out.println("Enter 3 for Balance Enquiry");
			System.out.println("Enter any number to perform above opertions");
			int selection = sc.nextInt();
			
			if(selection==0) {			
				System.out.println("Print the mini statement");
			}
			else if(selection==1) {	
				System.out.println("Please enter the amount which you want to withdraw");
				int Amount = sc.nextInt();
				if(Amount<=Balance) {
					System.out.println("Please collect your money from the ATM machine");
				}
				else {
					System.out.println("Sorry for your inconvenience, you have insufficient balance");
				}
			}
			else if(selection==2) {
				
				System.out.println("Please enter your old pin for the verification");
				int newpin = sc.nextInt();
				if(oldpin==newpin) {
					
					System.out.println("Please enter new pin");
					int newpin1 = sc.nextInt();
					System.out.println(newpin1);
					System.out.println("Pin verified successfully");
					}
				else {
					System.out.println("Pin not verified successfully");
				}
			}
			else if(selection==3) {			
				System.out.println("Check your balance details");
				System.out.println(Balance);
			}	
		}	
		else {			
			System.out.println("You have entered incorrect pin");
		}
		sc.close();
	}
}
