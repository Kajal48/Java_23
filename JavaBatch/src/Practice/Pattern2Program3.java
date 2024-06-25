package Practice;

public class Pattern2Program3 {
	
	public static void main(String[] args) {

//       1
//      1 2
//     1 2 3
//    1 2 3 4
//   1 2 3 4 5
//  1 2 3 4 5 6
//   1 2 3 4 5
//    1 2 3 4
//     1 2 3 
//      1 2
//       1

		int i;
		int j;
		for(i=1;i<=6;i++) {
			
			for(j=1;j<=(7-i);j++) {
							
				System.out.print(" ");
			}
						
			for(int k=1;k<=(i-1);k++) {
							
				System.out.print(k);
				System.out.print(" ");
			}
				System.out.println();
					
			}
				
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

