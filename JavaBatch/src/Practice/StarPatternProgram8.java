package Practice;

public class StarPatternProgram8 {

	public static void main(String[] args) {

// *
// * *
// * * *
// * * * *		
// * * *
// * *
// *
int i;
int j;
for(i=1; i<=7; i++){
	
	if(i<=4) {	
		for(j=1; j<=i; j++){
			System.out.print("* ");
		}
	}
	else {
		for(j=7; j>=i; j--){
			System.out.print("* ");
		}
	}
	
	System.out.println();
	}   	
  }
}
// i=1  1 star  space = 3    i+space = 4  (4-i)
// i=2  2 star  space = 2
// i=3  3 star  space = 1
// i=4  4 star  space = 0
// i=5  3 star  space = 1  
// i=6  2 star  space = 2
// i=7  1 star  space = 3