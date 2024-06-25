package Practice;

public class StarPatternProgram7 {

	public static void main(String[] args) {

// *******
//  *****
//   ***
//    *
	
		int star =7;
	for(int i=1;i<6;i++) {
		
		for (int j=1;j<=(2*i-1);j++) {
			
			System.out.print(" ");
		}
		
		for (int k=1;k<=star;k++) {

				System.out.print("* ");
				
		}
		star = star-2;
		
			
		System.out.println();	
	}
}
}
// i=1   7 stars    space = 0   (i-1) = space   i+star = 8 (8-i) -->(8-1) = 7
// i=2   5 stars    space = 2                   i+star = 7 (8-i) -->(8-2) = 6
// i=3   3 stars    space = 3                   i+star = 6 (8-i) -->(8-3) = 5
// i=4   1 star     space = 4                   i+star = 5 (8-i) -->(8-4) = 4

