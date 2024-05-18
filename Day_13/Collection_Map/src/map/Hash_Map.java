package map;
import Collection.Employee;

import java.util.*;


public class Hash_Map {
	
	
	    public static void main(String[] args) {
	        Map<String,Integer> numbers=new HashMap<>();
	        numbers.put("One",1);
	        numbers.put("Two",2);
	        numbers.put("",3);
//	        numbers.put("jhkl",);
	        System.out.println(numbers);
	        System.out.println(numbers.keySet());
	        System.out.println(numbers.values());
	        System.out.println(numbers.containsKey("One"));
	        System.out.println(numbers.containsValue(2));
//	        numbers.remove("Two");
//	        System.out.println(numbers);
	        Map<String,Integer> map=new HashMap<>();
	        map.put("Three",3);
	        map.putAll(numbers);
	        System.out.println(map);

	        Map<Integer,String> map1=new TreeMap<>();
	        map1.put(1,"hello");
	        map1.put(2,"");
	        map1.put(5,"hi");
	    List<Employee> list=new ArrayList<>();
	       Map<String,List<Employee>> map2=new HashMap<>();
	       Employee employee=
	               new Employee(1,"jghjg","fghf");
	       Employee employee1=
	               new Employee(2,"fghgf","tuytuy");
	       list.add(employee);
	       list.add(employee1);
	       map2.put("Tech",list);
	        System.out.println(map2);
	        Iterator itr= list.iterator();
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        Stack<List<Employee>> stack=new Stack<>();
	        stack.push(list);
	        System.out.println(stack);

	        stack.add(list);
	        System.out.println(stack);
//	        stack.pop();
//	     System.out.println(stack);
	     stack.remove(list);
	        System.out.println(stack);
//	        ArrayList<> arrayList=new ArrayList<>();
//	        List<> list1=new ArrayList<>();

	Stack<Map<String,List<Employee>>> stack1=new Stack<>();
	stack1.add(map2);
	        System.out.println(stack1);



	    }
}
