package week_2;

public class Tata extends Car{
	int yearOfMake;
	public Tata() {
		yearOfMake = 2004;
		type = "Compact";
		System.out.println("This is a Tata Nano. (Constructor of Tata Called)");
	}
	public String carName() {
		return "Tata Nano";
	}
	public int getYearOfMake() {
		return this.yearOfMake;
	}
	public String getType() {
		return this.type;
	}
}
