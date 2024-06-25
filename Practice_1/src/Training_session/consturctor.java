package Training_session;

public class consturctor {
	
	public consturctor() {
		
		System.out.println("This is a consturctor");
			
	}

	public consturctor(int a) {
		
		System.out.println("This is a consturctor "+a);
			
	}
	public static void main(String[] args) {
		
		consturctor obj = new consturctor();
		consturctor obj1 = new consturctor(5);
	}

}
