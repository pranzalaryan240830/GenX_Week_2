package week_2;

import java.util.Scanner;

public class Emp {
	private String Name;
	private String City;
	public void setter() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Emp Name: ");
		this.Name = s.nextLine();
		s.nextLine();
		System.out.print("Enter Emp City: ");
		this.City = s.nextLine();
	}
	public void getter() {
		System.out.println("\nEmployee Name: "+ this.Name+ "\nFrom: "+this.City);
	}
}
