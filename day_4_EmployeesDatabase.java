package week_2;

import java.util.ArrayList;
import java.util.Collections;

public class day_4_EmployeesDatabase {

	public static void main(String[] args) {
		ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("Mahesh Singh","IT",68000,32));
		emp.add(new employee("Akhil Singh","IT",73200,36));
		emp.add(new employee("Ananya Pal","HR",54000,23));
		emp.add(new employee("Shivam Pandey","Finance",55200,23));
		emp.add(new employee("Tanweer Alam","R&D",75160,32));
		emp.add(new employee("Priya Mathur","R&D",75560,33));
		
		Collections.sort(emp);
		System.out.println("Sorted Employees based on Salary!");
		System.out.println("\nName\t\tDept\tAge\tSalary\n");
		for(employee e:emp) {
			System.out.println(e.name + "\t" + e.dept + "\t" + e.age + "\t$" + e.sal);
		}

	}

}
