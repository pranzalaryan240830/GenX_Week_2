package week_2;

import java.util.LinkedList;
import java.util.Queue;

public class day_4_queues {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("Ajay");
		q.add("Salman");
		q.add("Akshay");
		q.add("Sid");
		System.out.println("Display initial Queue: "+q);
		System.out.println("\nDisplay element of Queue: "+ q.peek());
		System.out.println("Removing first element of Queue!");
		q.remove();
		System.out.println("\nDisplay New Queue: "+ q);
		System.out.println("Display first element of New Queue: "+ q.peek());
	}

}
