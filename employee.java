package week_2;

public class employee implements Comparable<employee> {
	String name;
	String dept;
	long sal;
	int age;
	
	public employee(String n, String d, long s, int a) {
		this.name = n;
		this.dept = d;
		this.sal = s;
		this.age = a;
	}
	
	public int compareTo(employee e) {
		if(sal == e.sal) 
			return 0;
		else if(sal> e.sal)
			return 1;
		else
			return -1;
	}
}
