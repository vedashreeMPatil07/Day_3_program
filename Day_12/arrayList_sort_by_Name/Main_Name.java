package arrayList_sort_by_Name;

import java.util.ArrayList;
import java.util.Collections;

public class Main_Name {

	public static void main(String[] args) {
		 ArrayList<Employee> employees = new ArrayList<>();
	        
	        employees.add(new Employee(2, "C", "Analyst"));
	        employees.add(new Employee(4, "D", "Tester"));
	        employees.add(new Employee(3, "A", "Manager"));
	        employees.add(new Employee(1, "B", "Developer"));

	        System.out.println("Before sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        Collections.sort(employees, new EmployeeBy_Name());
	        
	        // Display employees after sorting
	        System.out.println("\nAfter sorting by name:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	}
	}//list and set all methods and map
}//interface in variables and pass interface at the generic class
