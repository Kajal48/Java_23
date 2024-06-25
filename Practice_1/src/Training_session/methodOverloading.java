package Training_session;

public class methodOverloading {
	
	public void method1() {
		
		System.out.println("This is the method1");
	}
	
	public void method1(int a) {
		
		System.out.println("This is the method1  "+ a);
	}
	

	public static void main(String[] args) {

		methodOverloading obj = new methodOverloading();
		obj.method1();
		obj.method1(4);

	}

}
