package week_2;

public class A {
	private int x;
	protected int y;
	public int z;
	public A() {
		x=y=z=0;
	}
	public void show() {
		System.out.println("Public show() of A");
	}
	protected void display() {
		System.out.println("Protected display() of A");
	}
	private void see() {
		System.out.println("Private see() of A");
	}
}
