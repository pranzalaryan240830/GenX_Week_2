package week_2;

abstract public class Car {
	String type;
	public abstract String carName();
	public abstract int getYearOfMake();
	public abstract String getType();
	public Car() {
		System.out.println("This is a CAR. (Constructor of Car Called)");
	}
}
