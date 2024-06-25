package Practice;

public class StarPatternProgram3 {

	public static void main(String[] args) {

// * * * * * 
//  * * * *
//	 * * *
//	  * *	
//     *
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=(i-1);j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(6-i);k++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}

}

// i=1  5 stars    space = 0    (i-1 = 0) (i+star) = 6    (6-i) --> (6-1) = 5   
// i=2  4 stars    space = 1    (i-1 = 1)               (6-i) --> (6-2) = 4
// i=3  3 stars    space = 2    (i-1 = 2)               (6-i) --> (6-3) = 3
// i=4  2 stars    space = 3    (i-1 = 3)               (6-i) --> (6-2) = 2
// i=5  1 stars    space = 4    (i-1 = 4)               (6-i) --> (6-1) = 1