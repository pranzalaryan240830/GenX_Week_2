package week_2;

public class day_1_inheritance extends A{

	public static void main(String[] args) {
		A a = new A();
		a.display();
		// Visible here in child class
		
		a.show();
		// Visible here in child class
		
		//a.see(); 
		// Not visible here in child class
	
		//a.x = 2;
		System.out.println("\nPrivate Var x of A = \n(not visible)");
		// Not visible here in child class
		
		a.y = 3;
		System.out.println("Protected Var y of A = "+a.y +" \n(visible)");
		// Visible here in child class
		
		a.z = 4;
		System.out.println("Public Var z of A = "+a.z + " \n(visible)");
		// Visible here in child class
		
	}

}
