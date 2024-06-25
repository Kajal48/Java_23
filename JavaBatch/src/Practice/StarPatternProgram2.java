package Practice;

public class StarPatternProgram2 {

	public static void main(String[] args) {
		
//     *	
//    * *
//	 * * *	
//  * * * *
// * * * * *		
		for(int i=1;i<6;i++) {	
			
			for(int j=1;j<=(5-i);j++) {	
				
				System.out.print(" ");			
			}
			
			for(int k=1;k<=i;k++) {	
				
			System.out.print("* ");	
			}
			System.out.println();
		}	
	}		
}
//i = 1  1 star    space = 4   (i+Space = 5)  (5-i)
//i = 2  2 star    space = 3
//i = 3  3 star    space = 2
//i = 4  4 star    space = 1
//i = 5  5 star    space = 0

// i=1  j=1    1<=(5-1) --> 1<=4  k=1  1<=1            * 
// i=2  j=2    2<=(5-2)  --> 1<=3 k=1,2  1<=1, 2<=2   * *  
