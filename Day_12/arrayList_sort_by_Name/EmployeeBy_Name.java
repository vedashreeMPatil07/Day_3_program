package arrayList_sort_by_Name;

import java.util.Comparator;

public class EmployeeBy_Name  implements Comparator<Employee>{

	public static void main(String[] args) {

	}

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.geteName().compareTo(e2.geteName());
	}

}
