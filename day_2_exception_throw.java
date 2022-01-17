package week_2;

public class day_2_exception_throw {

	static void divide(int x,int y) {
		try {
			System.out.println("Division is: "+(x/y));
		}
		catch(ArithmeticException e) {
			throw new java.lang.ArithmeticException("Your divisor cannot be Zero!");
		}
		finally {
			System.out.println("divide() function excecuted!");
		}
	}
	public static void main(String[] args) {
		try {
			divide(7,0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("A custom Error from our function");
		}
		finally {
			System.out.println("Program of division Executed!");
		}

	}

}
