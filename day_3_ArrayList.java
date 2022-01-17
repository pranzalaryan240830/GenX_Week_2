package week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class day_3_ArrayList {

	public static void main(String[] args) {
		List<String> a = new ArrayList();
		a.add("Akash");
		a.add("Manish");
		a.add("Ajay");
		a.add("Himanshu");
		a.add("Amar");
		a.add("Akash");
		System.out.println("Initially Elements in ArrayList: ");
		System.out.println("Display ArrayList using Iterator: ");
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nAnother way to Display: "+ a);
		System.out.println("\nRemoving value at 3rd position:");
		a.remove(2);
		System.out.println("After Deletion: "+ a);
	}

}
