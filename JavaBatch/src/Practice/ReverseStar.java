package Practice;

public class ReverseStar {
	
	public static void main(String[] args) {

// * * * * *
// * * * *
// * * *
// * *
// *
				int i;
				for(i=1;i<=5;i++) {				
					for(int j=1;j<=(6-i);j++) {					
						System.out.print("* ");			
					}		
					System.out.println();
				}		
			}
		}
// i = 1   5 stars  i+ star = 6   (6-i)
// i = 2   4 stars  i+ star = 6
// i = 3   3 stars  i+ star = 6
// i = 4   2 stars  i+ star = 6
// i = 5   1 star   i+ star = 6

