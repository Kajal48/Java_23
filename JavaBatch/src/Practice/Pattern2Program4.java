package Practice;

public class Pattern2Program4 {
	
public static void main(String[] args) {
		
//      6 
//     5 6
//    4 5 6	
//   3 4 5 6 
//	2 3 4 5 6 
// 1 2 3 4 5 6
	
	
	int i,j;			
for(i=1;i<=6;i++) {
			
			for(j=1;j<=(6-i);j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k>=(i-1);k++) {
				
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
				
			}
	
	}

