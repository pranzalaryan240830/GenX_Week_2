package week_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class day_3_sets {

	public static void main(String[] args) {
		Set<String> s = new HashSet();
		s.add("Akash");
		s.add("Manish");
		s.add("Ajay");
		s.add("Himanshu");
		s.add("Manish");
		s.add("Amar");
		s.add("Akash");
		System.out.println("Initially Elements in Set (Nothing will be repeated): ");
		System.out.println("\nDisplaying Sets using Iterator: ");
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nAnother way to Display Sets: "+ s);
	}

}
