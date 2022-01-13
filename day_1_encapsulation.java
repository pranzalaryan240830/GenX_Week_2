package week_2;

public class day_1_encapsulation extends Emp {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		//e1.Name="Ramesh";
		//e1.City="Lucknow";
		//These will never be visible as Private and if var name in Emp class changes program would fail So we use -
		e1.setter(); //input
		e1.getter(); //output
	}

}
