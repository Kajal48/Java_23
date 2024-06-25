package Practice;

public class StarPatternProgram6 {

	public static void main(String[] args) {

//   *****
//	  ****
//     ***
//		**
//		 *
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=(i-1); j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(6-i);k++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}

// i=1   5 stars  spaces = 0     i-1 = 0
// i=2   4 stars  spaces = 1
// i=3   3 stars  spaces = 2
// i=4   2 stars  spaces = 3
// i=5   1 star   spaces = 4