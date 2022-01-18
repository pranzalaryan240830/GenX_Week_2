package week_2;

import java.util.HashMap;
import java.util.Map;

public class day_4_maps {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("A",23);
		m.put("B",12);
		m.put("C",83);
		System.out.println("Displaying Map: "+ m);
		
		System.out.println("\nDisplaying using Iterators: ");
		for(Map.Entry<String,Integer> it:m.entrySet()) {
			System.out.println(it.getKey() + " : " + it.getValue());
		}
	}

}
