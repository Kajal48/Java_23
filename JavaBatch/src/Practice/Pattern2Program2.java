package Practice;

public class Pattern2Program2 {
	
	public static void main(String[] args) {
		
//      1 
//     2 2
//    3 3 3	
//   4 4 4 4
//	5 5 5 5 5
// 6 6 6 6 6 6
				
for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=(6-i);j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
				
			}
	
	}
