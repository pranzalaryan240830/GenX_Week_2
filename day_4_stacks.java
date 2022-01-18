package week_2;

import java.util.Stack;

public class day_4_stacks {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Ajay");
		st.push("Salman");
		st.push("Akshay");
		st.push("Sid");
		System.out.println("Display initial Stack: "+st);
		System.out.println("\nDisplay top of Stack: "+ st.peek());
		System.out.println("Removing top of Stack:");
		st.pop();
		System.out.println("\nDisplay New Stack: "+st);
		System.out.println("Display top of New Stack: "+ st.peek());
		
	}

}
