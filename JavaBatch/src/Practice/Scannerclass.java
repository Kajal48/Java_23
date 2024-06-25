package Practice;
import java.util.Scanner;

public class Scannerclass {
	
	public static void main(String[] args) {
		
		int Sum;
		float Percentage;
		System.out.println("Please enter first subject marks");
		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		System.out.println("Please enter second subject marks");
		int sub2 = sc.nextInt();
		System.out.println("Please enter third subject marks");
		int sub3 = sc.nextInt();
		System.out.println("Please enter fourth subject marks");
		int sub4 = sc.nextInt();
		System.out.println("Please enter fifth subject marks");
		int sub5 = sc.nextInt();
		Sum = (sub1 + sub2 + sub3 + sub4 + sub5);
		System.out.println(Sum);
		Percentage = (Sum*100)/600;
		System.out.println(Percentage);
		if(Percentage>90) 
		{
			System.out.println("Grade:- A+");
		}
		else if(Percentage>80 && Percentage<91) 
		{
			System.out.println("Grade:- A");
		}
		else if(Percentage>70 && Percentage<81) 
		{
			System.out.println("Grade:- B+");
		}
		else if(Percentage>60 && Percentage<71) 
		{
			System.out.println("Grade:- B");
		}
		else if(Percentage>33 && Percentage<61) 
		{
			System.out.println("Grade:- C");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println(name);
		
		if (Percentage>80) 
		{
			System.out.println(name+ " you are eligible for scholarship program for future study in our school");
			System.out.println("Thankyou for consideration, we will call you soon. Please leave your mobile number");
		}
		else
		{
				System.out.println("Thankyou and all the best for your future");
		}
		sc.close();
	}
	
}

