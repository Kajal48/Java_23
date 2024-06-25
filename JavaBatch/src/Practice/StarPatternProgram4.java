package Practice;

public class StarPatternProgram4 {

	public static void main(String[] args) {
//        *
//       *** 	
//		*****
//	   *******
//	  *********
//	 *********** 
//	*************
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=(7-i);j++) {
				
				System.out.print(" ");
			}		
			for(int k=1;k<=(2*i-1) ;k++) {
				
				System.out.print("*");
			
				}	
			System.out.println(); 
			}
	}
}

//i= 1   1 stars     Space = 6     (i+space) = 7    (7-i)= space   (star - i) --> (1-1 =  0)
//i= 2   3 stars     Space = 5                                     (star - i) --> (3-2 =  1)
//i= 3   5 stars     Space = 4                                     (star - i) --> (5-3 =  2)
//i= 4   7 stars     Space = 3                                     (star - i) --> (7-4 =  3)
//i= 5   9 stars     Space = 2                                     (star - i) --> (9-5 =  4)
//i= 6   11 stars    Space = 1                                     (star - i) --> (11-6 = 5)
//i= 7   13 stars    Space = 0                                     (star - i) --> (13-7 = 6)

// 2*1


