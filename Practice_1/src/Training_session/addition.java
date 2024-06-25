package Training_session;

public class addition {
	
	public void add(int a, int b){
		System.out.println("Addition is " + (a+b));
	}
	
public class substraction extends addition{
	
	public void sub(int a, int b) {
		System.out.println("substraction is " + (a-b));
	}
	
public class multiplication extends substraction{
		
		public void mul(int a, int b) {
			System.out.println("Multiplication is " + (a*b));
			
		}	
public class division extends addition{
			
			public static void div(int a, int b) {
				System.out.println("Division is " + (a/b));
				}	
	public static void main(String[] args){

		multiplication object1 = new multiplication();
		div(6,3);
		object1.mul(3,6);
		object1.sub(8,6);
		object1.add(4,6);
	}
	
}
}
}
}
