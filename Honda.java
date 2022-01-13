package week_2;

public class Honda extends Car{
	int yearOfMake;
	public Honda() {
		yearOfMake = 2008;
		type = "Sedan";
		System.out.println("This is a Honda City. (Constructor of Honda Called)");		
	}
	public String carName() {
		return "Honda City";
	}
	public int getYearOfMake() {
		return this.yearOfMake;
	}
	public String getType() {
		return this.type;
	}
}
