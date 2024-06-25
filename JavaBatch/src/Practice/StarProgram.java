package Practice;

public class StarProgram {

	public static void main(String[] args) {

// * 
// * * 
// * * *
// * * * *
// * * * * *
		int i;
		for(i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");			
			}		
			System.out.println();
		}		
	}
}

// i = 1   1 stars  (star = i)
// i = 2   2 stars  
// i = 3   3 stars  
// i = 4   5 stars  
// i = 5   5 star   