package array_list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ArrayList_01 {

	public static void main(String[] args) {

		
		ArrayList al =new ArrayList();
		al.add("hello");
		al.add(12);
		al.add(45.0);
		ArrayList<Employee> al1=new ArrayList<>();
		al1.add(null);
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Id , name and position: ");
		int id =sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String position =sc.next();
		
				Employee e =new Employee();
				Employee e1 =new Employee();
						
				al1.add(e);
				al1.add(e1);
				al1.add(e);
				al1.remove(e);
			System.out.println(al1);
	
			
			 ArrayList<Employee> arrayList2=new ArrayList<>();
			 
			         arrayList2.add(e1);
			         boolean b = arrayList2.retainAll(al1);
			         System.out.println(b);
			         System.out.println(arrayList2);
			         System.out.println(al1);
			         Collections.sort(al1,new Employee_by_Id());
			         System.out.println(al1);
			         for(Employee emp:al1)
			         {
			             System.out.println(e);
			         }
			         Employee employee2=new Employee(11,"","");
			         Set<Employee> employees=new HashSet<>();
			         employees.add(e);
			         employees.add(e1);
			         employees.add(employee2);
			         employees.add(e1);
			         System.out.println(employees);
			         Set<String> set=new HashSet<>();
			         set.add("");
			         set.add("");
			         set.add("joker");
			         System.out.println(set);
	}
	
	}

