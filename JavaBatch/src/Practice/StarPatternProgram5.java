package Practice;

public class StarPatternProgram5 {

		public static void main(String[] args) {

//	        *
//	       ** 	
//		  ***
//       **** 
//      ***** 
//     ******
			for(int i=1;i<=6;i++) {
				
				for(int j=1;j<=(6-i);j++) {
					
					System.out.print(" ");
				}
				
				for(int k=1;k<=i;k++) {
					
					System.out.print("*");
				}
				System.out.println();
			}
		
		}

	}

//i= 1   1 stars     Space = 5     (i+space) = 6    (6-i)= space   
//i= 2   2 stars     Space = 4                                     
//i= 3   3 stars     Space = 3                                    
//i= 4   4 stars     Space = 2                                     
//i= 5   5 stars     Space = 1                                     
//i= 5   6 stars     Space = 0                                     

