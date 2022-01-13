package week_2;

public class day_1_abstraction {

	public static void main(String[] args) {
		Car c1 = new Honda();
		Car c2 = new Tata();
		System.out.println("\n\nCar Details are: ");
		
		System.out.println("\nName: "+c1.carName()+"\nType: "+c1.getType()+"\nYear of Make: "+c1.getYearOfMake());
		System.out.println("\nName: "+c2.carName()+"\nType: "+c2.getType()+"\nYear of Make: "+c2.getYearOfMake());
		
	}

}
