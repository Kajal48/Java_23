package Practice;

public class Pattern2Program1 {
	
	public static void main(String[] args) {
		
// 1 2 3 4 5 6	
//  1 2 3 4 5 
//   1 2 3 4 	
//    1 2 3 
//     1 2 
//		1
		
		int i;
		int j;
		
         for(i=1;i<=6;i++) {
			
			for(j=1;j<=(i-1);j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=(7-i);k++) {
				
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*
 * i=1 space=0  (i-1)
 * i=2 space=1 
 * i=3 space=2 
 * i=4 space=3 
 * i=5 space=4 
 * i=6 space=5
 */
