package week_2;

import java.util.Scanner;

public class day_2_exception {

	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("\nEnter a :");
			int a = s.nextInt();
			System.out.print("\nEnter b :");
			int b = s.nextInt();
			System.out.println(a+"/"+b+" = "+ a/b);
		}
		catch(Exception e) {
			System.out.println("Sorry Cannot divide by Zero!!!!! It lead to :"+e);
			System.out.println("Your result is = infinity");
		}

	}

}
